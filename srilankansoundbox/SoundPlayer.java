package com.app.chanuka.srilankansoundbox;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;

public class SoundPlayer {

    private AudioAttributes audioAttributes;
    final int SOUND_POOL_MAX = 2;

    private static SoundPool soundPool;
    private static int aiooSound;
    private static int w5Sound;
    private static int absurdSound;
    private static int aisaySound;
    private static int anneSound;
    private static int chickkSound;
    private static int cricketChantSound;
    private static int letsGoSound;
    private static int shaSound;
    private static int shapeSound;
    private static int biddySound;
    private static int badhungSound;
    private static int thunderingSlapSound;
    private static int yakkoSound;
    private static int goodSound;
    private static int wthSound;
    private static int ammooSound;
    private static int bailaSound;
    private static int bringItSound;
    private static int celebrationSound;
    private static int deltatoffeeSound;
    private static int dostharasongSound;
    private static int kolikuttuSound;
    private static int mintingSound;
    private static int mygodSound;
    private static int scoobydooSound;
    private static int surrapappaSound;

    public SoundPlayer(Context context){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setAudioAttributes(audioAttributes)
                    .setMaxStreams(SOUND_POOL_MAX)
                    .build();
        }else{
            //SoundPool (int maxStreams, int streamType, int srcQuality)
            soundPool = new SoundPool(SOUND_POOL_MAX, AudioManager.STREAM_MUSIC,0);
        }

        aiooSound = soundPool.load(context, R.raw.aioo, 1);
        w5Sound = soundPool.load(context, R.raw.w5, 1);
        absurdSound = soundPool.load(context, R.raw.absurd, 1);
        aisaySound = soundPool.load(context, R.raw.aisay, 1);
        anneSound = soundPool.load(context, R.raw.ane, 1);
        chickkSound = soundPool.load(context, R.raw.chickk, 1);
        cricketChantSound = soundPool.load(context, R.raw.cricketchant, 1);
        letsGoSound = soundPool.load(context, R.raw.letsgo, 1);
        shaSound = soundPool.load(context, R.raw.sha, 1);
        shapeSound = soundPool.load(context, R.raw.shape, 1);
        biddySound = soundPool.load(context, R.raw.thadda_biddy, 1);
        badhungSound = soundPool.load(context, R.raw.thadung_badung, 1);
        thunderingSlapSound = soundPool.load(context, R.raw.thunderingslap, 1);
        yakkoSound = soundPool.load(context, R.raw.yakko, 1);
        goodSound = soundPool.load(context, R.raw.verygood4u, 1);
        wthSound = soundPool.load(context, R.raw.wth, 1);
        ammooSound = soundPool.load(context, R.raw.ammmoo, 1);
        bailaSound = soundPool.load(context, R.raw.baila, 1);
        bringItSound = soundPool.load(context, R.raw.bringit, 1);
        celebrationSound = soundPool.load(context, R.raw.celebrateion, 1);
        deltatoffeeSound = soundPool.load(context, R.raw.deltatoffee, 1);
        dostharasongSound = soundPool.load(context, R.raw.dostharasong, 1);
        kolikuttuSound = soundPool.load(context, R.raw.kolikuttu, 1);
        mintingSound = soundPool.load(context, R.raw.miniting, 1);
        mygodSound = soundPool.load(context, R.raw.mygod, 1);
        scoobydooSound = soundPool.load(context, R.raw.scoobydoo, 1);
        surrapappaSound = soundPool.load(context, R.raw.surrapappa, 1);

    }

    public void playAiooSound(){
        soundPool.play(aiooSound,1.0f,1.0f,1,0,1.0f);
    }

    public void playw2(){
        soundPool.play(w5Sound,1.0f,1.0f,1,0,1.0f);
    }

    public void playAbsurdSound(){
        soundPool.play(absurdSound,1.0f,1.0f,1,0,1.0f);
    }

    public void playaisaySound(){
        soundPool.play(aisaySound,1.0f,1.0f,1,0,1.0f);
    }

    public void playanneSound(){
        soundPool.play(anneSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playchickkSound(){
        soundPool.play(chickkSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playcricketChantSound(){
        soundPool.play(cricketChantSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playletsGoSound(){
        soundPool.play(letsGoSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playshaSound(){
        soundPool.play(shaSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playshapeSound(){
        soundPool.play(shapeSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playbiddySound(){
        soundPool.play(biddySound,1.0f,1.0f,1,0,1.0f);
    }
    public void playbadhungSound(){
        soundPool.play(badhungSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playthunderingSlapSound(){
        soundPool.play(thunderingSlapSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playyakkoSound(){
        soundPool.play(yakkoSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playgoodSound(){
        soundPool.play(goodSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playwthSound(){
        soundPool.play(wthSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playammooSound(){
        soundPool.play(ammooSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playbailaSound(){
        soundPool.play(bailaSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playbringItSound(){
        soundPool.play(bringItSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playcelebrationSound(){
        soundPool.play(celebrationSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playdeltatoffeeSound(){
        soundPool.play(deltatoffeeSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playdostharasongSound(){
        soundPool.play(dostharasongSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playkolikuttuSound(){
        soundPool.play(kolikuttuSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playmintingSound(){
        soundPool.play(mintingSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playmygodSound(){
        soundPool.play(mygodSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playscoobydooSound(){
        soundPool.play(scoobydooSound,1.0f,1.0f,1,0,1.0f);
    }
    public void playsurrapappaSound(){
        soundPool.play(surrapappaSound,1.0f,1.0f,1,0,1.0f);
    }

}
