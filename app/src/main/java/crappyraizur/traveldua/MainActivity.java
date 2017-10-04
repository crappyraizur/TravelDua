package crappyraizur.traveldua;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Context context = this;
    MediaPlayer mp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(context, R.raw.ring);
        final Button b = (Button) findViewById(R.id.button2);
        final Button pause = (Button) findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(context, R.raw.ring);
                    } mp.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        })  ;
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    mp.stop();
                    mp.release();
                    mp = MediaPlayer.create(context, R.raw.ring);
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
    }
}
