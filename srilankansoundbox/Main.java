package com.app.chanuka.srilankansoundbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Main extends AppCompatActivity {

    private SoundPlayer sound;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        sound = new SoundPlayer(this);

       // MobileAds.initialize(this, "YOUR_ADMOB_APP_ID");

        interstitial = new InterstitialAd(this);

        interstitial.setAdUnitId("ca-app-pub-9167408919955062/4676875091");

        AdRequest adRequest = new AdRequest.Builder().build();

        interstitial.loadAd(adRequest);

        interstitial.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                displayInterstitial();
            }
        });

    }

    public void displayInterstitial(){
        if(interstitial.isLoaded()){
            interstitial.show();
        }
    }

    public void aiooClick(View view){
        sound.playAiooSound();
    }
    public void absurdClick(View view){
        sound.playAbsurdSound();
    }
    public void aisayClick(View view){
        sound.playaisaySound();
    }
    public void anneClick(View view){
        sound.playanneSound();
    }
    public void chickkClick(View view){
        sound.playchickkSound();
    }
    public void chantClick(View view){
        sound.playcricketChantSound();
    }
    public void warellaClick(View view){
        sound.playletsGoSound();
    }
    public void shaClick(View view){
        sound.playshaSound();
    }
    public void shapeClick(View view){
        sound.playshapeSound();
    }
    public void biddyClick(View view){
        sound.playbiddySound();
    }
    public void baddungClick(View view){
        sound.playbadhungSound();
    }
    public void slapClick(View view){
        sound.playthunderingSlapSound();
    }
    public void w5Click(View view){
        sound.playw2();
    }
    public void yakkoClick(View view){
        sound.playyakkoSound();
    }
    public void goodClick(View view){
        sound.playgoodSound();
    }
    public void hellClick(View view){
        sound.playwthSound();
    }
    public void ammooClick(View view){
        sound.playammooSound();
    }
    public void bailaClick(View view){
        sound.playbailaSound();
    }
    public void celebrateClick(View view){
        sound.playcelebrationSound();
    }
    public void deltatoffeeClick(View view){
        sound.playdeltatoffeeSound();
    }
    public void doctorClick(View view){
        sound.playdostharasongSound();
    }
    public void kolikuttuClick(View view){
        sound.playkolikuttuSound();
    }
    public void minitingClick(View view){
        sound.playmintingSound();
    }
    public void mygodClick(View view){
        sound.playmygodSound();
    }
    public void scoobydooClick(View view){
        sound.playscoobydooSound();
    }
    public void surrapappaClick(View view){
        sound.playsurrapappaSound();
    }
    public void bringitClick(View view){
        sound.playbringItSound();
    }
}
