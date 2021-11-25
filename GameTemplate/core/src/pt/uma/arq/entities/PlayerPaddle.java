package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PlayerPaddle {

    private Texture background;
    private Sprite sprite;
    SpriteBatch spriteBatch;
    private int x;
    private int direcao;
    private int velocity;

    public PlayerPaddle(SpriteBatch batch) {
        this.spriteBatch = batch;
        this.velocity = 10;
        this.direcao = 1;
        background = new Texture("mario.png");
        sprite = new Sprite(background);
        sprite.setPosition(Gdx.graphics.getWidth()/2, 50);
    }

    public void updateMore(){
        /**
        if(verify == true){
            x-=10;
            sprite.setPosition(x, 50);
            if(x <= 0){
                verify = false;
            }
        }else{
            x+=10;
            if(x >= Gdx.graphics.getWidth() - sprite.getWidth()){
                verify = true;
            }else{
                sprite.setPosition(x, 50);
            }
        }**/
        x = x + (velocity * direcao);
        if(x >= Gdx.graphics.getWidth() - sprite.getWidth()){
            direcao = -1;
        }
        if(x <= 0){
            direcao = 1;
        }
        sprite.setPosition(x, 50);
    }

    public void render() {
        sprite.draw(spriteBatch);
    }

}
