package com.example.shimmertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {

    private Button activate_button, deactivate_button;
    private ShimmerFrameLayout mShimmerViewContainer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activate_button = findViewById(R.id.button_start_animation);
        mShimmerViewContainer = findViewById(R.id.shimmer_container);
        deactivate_button = findViewById(R.id.button_stop_animation);

        activate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mShimmerViewContainer.startShimmerAnimation();
            }
        });

        deactivate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mShimmerViewContainer.stopShimmerAnimation();
            }
        });

    }
}
/**
 * 1. add the shimmer dependency to the build.gradle file
 * 2. wrap the layout you want to animate with com.facebook.shimmer.ShimmerFrameLayout in the xml layout
 * 3. using findViewById initialize the shimmer conatainer you used as wrapper above
 * 4. then use the startShimerAnimationMethod to start and the other methods respectively
 */
