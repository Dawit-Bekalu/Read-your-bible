package com.readbible.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvVerseReference;
    private TextView tvVerseText;
    private Button btnNextVerse;

    private String[] references = {
        "ዮሐንስ 3:16",
        "መዝሙር 23:1",
        "ፊልጵስዩስ 4:13",
        "ምሳሌ 3:5"
    };

    private String[] verses = {
        "በእርሱ የሚያምን ሁሉ የዘላለም ሕይወት እንዲኖረው እንጂ እንዳይጠፋ እግዚአብሔር አንድያ ልጁን እስኪሰጥ ድረስ ዓለሙን እንዲሁ ወዶአልና።",
        "እግዚአብሔር እረኛዬ ነው፥ የሚያጎድልብኝም የለም። በለመለመ መስክ ያሳድረኛል፤ በዕረፍት ውኃ ዘንድ ይመራኛል።",
        "ኃይልን በሚሰጠኝ በእርሱ ሁሉን እችላለሁ።",
        "በፍጹም ልብህ በእግዚአብሔር ታመን፥ በራስህም ማስተዋል አትደገፍ፤ በመንገድህ ሁሉ እርሱን እወቅ፥ እርሱም ጎዳናህን ያቀናልሃል።"
    };

    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvVerseReference = findViewById(R.id.tvVerseReference);
        tvVerseText = findViewById(R.id.tvVerseText);
        btnNextVerse = findViewById(R.id.btnNextVerse);

        btnNextVerse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = (currentIndex + 1) % verses.length;
                tvVerseReference.setText(references[currentIndex]);
                tvVerseText.setText(verses[currentIndex]);
            }
        });
    }
}
