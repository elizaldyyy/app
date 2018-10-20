package iics.johnelizaldy.katon.katonlabexer5;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i =  new Intent(this, IntentLogs.class);
        this.startService(i);
    }

    public void option (View v){
        Intent i = null, chooser= null;

        if (v.getId() == R.id.actButton){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.mapButton){
            i = new Intent(Intent.ACTION_VIEW);

            i.setData(Uri.parse("geo:14.1153, 120.9621"));
            chooser = Intent.createChooser(i, "Maps");
            startActivity(chooser);
        }
    }
}
