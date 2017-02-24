package pdm.joffily.me.barcode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

public class MainActivity extends AppCompatActivity {

    ImageView barCode;
    Button btnScan;
    TextView resultText;
    Bitmap myBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.barCode = (ImageView) this.findViewById(R.id.imgview);
        this.btnScan = (Button) this.findViewById(R.id.button);
        this.resultText = (TextView) this.findViewById(R.id.txtContent);
        // Carregando imagem
        this.myBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.ponny);

        // Setando imagem
        barCode.setImageBitmap(myBitmap);

        BarcodeDetector detector = new BarcodeDetector
                .Builder(getApplicationContext())
                .setBarcodeFormats(Barcode.DATA_MATRIX | Barcode.QR_CODE).build();

        if (!detector.isOperational()) {
            this.resultText.setText("Não foi possível usar o detector");
            return;
        }

        Frame frame = new Frame.Builder().setBitmap(MainActivity.this.myBitmap).build();
        SparseArray<Barcode> barcodes = detector.detect(frame);
        Barcode thisCode = barcodes.valueAt(0);
        MainActivity.this.resultText.setText(thisCode.rawValue);


        this.btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BarcodeDetector detector = new BarcodeDetector
                        .Builder(MainActivity.this.getApplicationContext())
                        .setBarcodeFormats(Barcode.DATA_MATRIX | Barcode.QR_CODE).build();

                if (!detector.isOperational()) {
                    MainActivity.this.resultText.setText("Não foi possível usar o detector");
                    return;
                }

                Frame frame = new Frame.Builder().setBitmap(MainActivity.this.myBitmap).build();
                SparseArray<Barcode> barcodes = detector.detect(frame);
                Barcode thisCode = barcodes.valueAt(0);
                MainActivity.this.resultText.setText(thisCode.rawValue);
            }
        });
    }
}
