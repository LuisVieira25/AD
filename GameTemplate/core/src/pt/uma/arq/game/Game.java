package pt.uma.arq.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.entities.PlayerPaddle;


public class Game extends ApplicationAdapter {
    private SpriteBatch batch;
    private BackgroundManagement backgroundManagement;
    private PlayerPaddle playerPaddle;
    private BitmapFont font;

    @Override
    public void create() {
        Gdx.graphics.setWindowedMode(1280, 720);
        batch = new SpriteBatch();

        backgroundManagement = new BackgroundManagement(batch);
        playerPaddle = new PlayerPaddle(batch);
        font = new BitmapFont(Gdx.files.internal("gamefont.fnt"),
                Gdx.files.internal("gamefont.png"), false);
    }

    @Override
    public void render() {

        playerPaddle.updateMore();

        // Render
        batch.begin();
        backgroundManagement.render();
        playerPaddle.render();
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

}