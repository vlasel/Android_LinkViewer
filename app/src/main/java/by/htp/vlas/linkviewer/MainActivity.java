package by.htp.vlas.linkviewer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by VlasEL on 15.02.2015 15:16
 */
public class MainActivity extends Activity {

    @InjectView(R.id.link_address)
    EditText mLinkAddressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.btn_go)
    void btnGoAction() {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        String uriString = mLinkAddressView.getText().toString();
        if(!TextUtils.isEmpty(uriString)) {
            intent.setData(Uri.parse(uriString));
            startActivity(intent);
        }


    }
}
