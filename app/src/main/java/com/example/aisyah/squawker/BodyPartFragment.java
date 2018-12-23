package com.example.aisyah.squawker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CITRA on 9/25/2018.
 */

public class BodyPartFragment extends Fragment {
    public static  final String IMAGE_ID_LIST= "image_ids";
    public static final String LIST_INDEX = "list_index";
    private static final String TAG = "BodyPartFragment";
    //variabel global untuk memanggil list gambar
    private List<Integer> mImageIds;
    private int mListIndex;
    public BodyPartFragment(){

    }

    //jika “saved instance” tidak ‘null’ maka variabel array dan index memanggal keadaan sebelumnya
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //melakukan “create fragment” berikan statment jika “saved instance” tidak ‘null’ maka variabel array dan index memanggal keadaan sebelumnya
        if(savedInstanceState != null){
            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex = savedInstanceState.getInt(LIST_INDEX);
        }
        View rootView = inflater.inflate(R.layout.body_part_layout_fragment, container, false);
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.ImageView_body_part_layout_fragment);
        if(mImageIds != null){
            // dilakukan agar gambar dan index dapat diakses secara dinamis dari luar kelas BodyPartFragments.
            imageView.setImageResource(mImageIds.get(mListIndex));
            imageView.setOnClickListener(new View.OnClickListener() {

                //merubah index dari gambar yang terdapat pada ImageView
                @Override
                public void onClick(View view) {
                    if(mListIndex < mImageIds.size()-1){
                        mListIndex++;
                    }else {
                        mListIndex = 0;
                    }
                    imageView.setImageResource(mImageIds.get(mListIndex));
                }
            });
        } else {
            Log.v(TAG, "Tidak ada fragmen");
        }
        return rootView;
    }

    //memanggil list gambar
    public  void  setmImageIds(List<Integer> imageIds){
        mImageIds = imageIds;
    }

    public void setmListIndex(int index){
        mListIndex = index;
    }

    // method Override untuk menyimpan variabel array beserta index
    @Override
    public void onSaveInstanceState(Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX,mListIndex);
    }
}
