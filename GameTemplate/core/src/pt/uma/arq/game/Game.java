package pt.uma.arq.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.entities.*;

import java.util.ArrayList;


public class Game extends ApplicationAdapter {
    private SpriteBatch batch;
    private BackgroundManagement backgroundManagement;
    private PlayerPaddle playerPaddle;
    private Ball ball;
    private GreenBlock greenBlock;
    private GreenBlock bloco;
    private Board bcs;
    int count = 40;
    private BitmapFont font;

    @Override
    public void create() {
        batch = new SpriteBatch();

        backgroundManagement = new BackgroundManagement(batch);
        playerPaddle = new PlayerPaddle(batch);
        ball = new Ball(batch);
        greenBlock = new GreenBlock(batch,5, 50, Gdx.graphics.getHeight() - 50);
        ArrayList<Block> blocks = new ArrayList<>();
        for(int i = 0; i <= 30; i++){
            bloco = new GreenBlock(batch,5, count, Gdx.graphics.getHeight() - 50);
            count += 60;
            blocks.add(bloco);
        }
        bcs = new Board(blocks);
        font = new BitmapFont(Gdx.files.internal("gamefont.fnt"), Gdx.files.internal("gamefont.png"), false);
        ball.create();
        playerPaddle.create();
        for (Block b: bcs.getBlocks()) {
                b.create();
        }
    }

    @Override
    public void render() {

        ball.updatePosition();
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D)){
            playerPaddle.updatePositionRight();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)){
            playerPaddle.updatePositionLeft();
        }

        if(ball.getBoundingBox().intersects(playerPaddle.getBoundingBox())){
            ball.changeDirection();
        }

        for (Block b: bcs.getBlocks()) {
            if(ball.getBoundingBox().intersects(b.getBoundingBox())){
                ball.changeDirection();
            }
        }

        // Render
        batch.begin();
        backgroundManagement.render();
        playerPaddle.render();
        ball.render();
        for (Block b: bcs.getBlocks()) {
            b.render();
        }
        if(ball.getGameStatus() == false){
            font.draw(batch, "GAME OVER!", Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        }
        batch.end();

        if(Gdx.input.isKeyPressed(Input.Keys.ESCAPE) || Gdx.input.isKeyPressed(Input.Keys.BACKSPACE)){
            Gdx.app.exit();
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

}