package langsdroid.myapplication;

import android.graphics.Camera;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

/**
 * Created by LangstonSmith on 10/19/16.
 */

public class CameraFragment extends Fragment {

    private Camera mCamera;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.camera_fragment, container, false);

        TextView tv = (TextView) v.findViewById(R.id.textview_camera_fragment);
        tv.setText(getArguments().getString("msg"));

        return v;
    }

    public static CameraFragment newInstance(String text) {

        CameraFragment f = new CameraFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;


    }

    @Override
    public void onResume() {
        super.onResume();
    }
}