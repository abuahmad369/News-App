package com.example.class_243_complete_news_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    HashMap<String,String> hashMap = new HashMap<>();
    ArrayList < HashMap<String,String> > arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        createTable();

        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);

    }

    //################################
    private class MyAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.item, parent, false);

            LinearLayout layItem = findViewById(R.id.layItem);

            ImageView tvCover = myView.findViewById(R.id.tvCover);
            TextView tvCatagory = myView.findViewById(R.id.tvCatagory);
            TextView tvTitle = myView.findViewById(R.id.tvTitle);
            TextView tvDescription = myView.findViewById(R.id.tvDescription);

            HashMap <String, String> hashMap = arrayList.get(position);
            String Catagory = hashMap.get("Catagory");
            String Image_url = hashMap.get("Image_url");
            String Title = hashMap.get("Title");
            String Description = hashMap.get("Description");

            Picasso.get().load(Image_url)
                    .placeholder(R.drawable.mypic)
                    .into(tvCover);

            tvCatagory.setText(Catagory);
            tvTitle.setText(Title);
            tvDescription.setText(Description);

            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            tvCatagory.setBackgroundColor(color);

            //##########
            layItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(MainActivity.this, NewsDetails.class));

                }
            });
            //##########

            return myView;
        }
    }
    //################################

    //################################

    private void createTable(){

        hashMap = new HashMap<>();
        hashMap.put("Catagory", "Tech");
        hashMap.put("Image_url", "https://i.gadgets360cdn.com/large/samsung_galaxy_s23_series_1675273558643.jpg");
        hashMap.put("Title", "Samsung Galaxy S24, Galaxy S24+, Galaxy S24 Ultra Renders, Full Specifications Leak Online");
        hashMap.put("Description", "Samsung is gearing up to launch the next generation of Galaxy S series smartphones early next year. A series of leaks have already shed light on the features of the flagship smartphones ahead of the rumoured launch on January 17. Most recently, renders of the Galaxy S24, Galaxy S24+, and Galaxy S24 Ultra have leaked online along with their full specifications. Both Galaxy S24+ and Galaxy S24 Ultra are said to run on Snapdragon 8 Gen 3 SoC, paired with 12GB of RAM. The Galaxy S24, in contrast, is tipped to be powered by an Exynos 2400 chipset. The Galaxy S24 Ultra is expected to have a Titanium frame while the vanilla and Plus models could have an aluminium armour frame.\n" +
                "\n" +
                "Windows Report has leaked alleged renders and full specifications of the upcoming Galaxy S24, Galaxy S24+, and Galaxy S24 Ultra in a new report. The leaked renders also suggest the Galaxy S24 series colour options. The handsets are seen in black, gray, violet, and yellow shades with a hole punch display design and minimal bezels. The Galaxy S24 Ultra is seen with a flat back panel and a flat display with integrated S Pen. It appears to have a quad camera setup on the rear with all four cameras housed inside separate rings. The Galaxy S24 and the Galaxy S24+ are shown with triple rear cameras. The images indicate a similar design language to that of the Galaxy S23 series.\n" +
                "\n" +
                "The Galaxy S24 Ultra will be reportedly available in titanium black, titanium gray, titanium violet, and titanium yellow colour options, whereas the colour versions of Galaxy S24 and Galaxy S24+ could be called onyx black, marble grey, cobalt violet, and amber yellow.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("Catagory", "Tech");
        hashMap.put("Image_url", "https://i.gadgets360cdn.com/large/amazon_india_reuters_1611115990104.jpg");
        hashMap.put("Title", "Samsung Galaxy S24, Galaxy S24+, Galaxy S24 Ultra Renders, Full Specifications Leak Online");
        hashMap.put("Description", "Samsung is gearing up to launch the next generation of Galaxy S series smartphones early next year. A series of leaks have already shed light on the features of the flagship smartphones ahead of the rumoured launch on January 17. Most recently, renders of the Galaxy S24, Galaxy S24+, and Galaxy S24 Ultra have leaked online along with their full specifications. Both Galaxy S24+ and Galaxy S24 Ultra are said to run on Snapdragon 8 Gen 3 SoC, paired with 12GB of RAM. The Galaxy S24, in contrast, is tipped to be powered by an Exynos 2400 chipset. The Galaxy S24 Ultra is expected to have a Titanium frame while the vanilla and Plus models could have an aluminium armour frame.\n" +
                "\n" +
                "Windows Report has leaked alleged renders and full specifications of the upcoming Galaxy S24, Galaxy S24+, and Galaxy S24 Ultra in a new report. The leaked renders also suggest the Galaxy S24 series colour options. The handsets are seen in black, gray, violet, and yellow shades with a hole punch display design and minimal bezels. The Galaxy S24 Ultra is seen with a flat back panel and a flat display with integrated S Pen. It appears to have a quad camera setup on the rear with all four cameras housed inside separate rings. The Galaxy S24 and the Galaxy S24+ are shown with triple rear cameras. The images indicate a similar design language to that of the Galaxy S23 series.\n" +
                "\n" +
                "The Galaxy S24 Ultra will be reportedly available in titanium black, titanium gray, titanium violet, and titanium yellow colour options, whereas the colour versions of Galaxy S24 and Galaxy S24+ could be called onyx black, marble grey, cobalt violet, and amber yellow.");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("Catagory", "Tech");
        hashMap.put("Image_url", "https://i.gadgets360cdn.com/large/samsung_galaxy_s23_series_1675273558643.jpg?downsize=950:*");
        hashMap.put("Title", "Samsung Galaxy S24, Galaxy S24+, Galaxy S24 Ultra Renders, Full Specifications Leak Online");
        hashMap.put("Description", "Samsung is gearing up to launch the next generation of Galaxy S series smartphones early next year. A series of leaks have already shed light on the features of the flagship smartphones ahead of the rumoured launch on January 17. Most recently, renders of the Galaxy S24, Galaxy S24+, and Galaxy S24 Ultra have leaked online along with their full specifications. Both Galaxy S24+ and Galaxy S24 Ultra are said to run on Snapdragon 8 Gen 3 SoC, paired with 12GB of RAM. The Galaxy S24, in contrast, is tipped to be powered by an Exynos 2400 chipset. The Galaxy S24 Ultra is expected to have a Titanium frame while the vanilla and Plus models could have an aluminium armour frame.\n" +
                "\n" +
                "Windows Report has leaked alleged renders and full specifications of the upcoming Galaxy S24, Galaxy S24+, and Galaxy S24 Ultra in a new report. The leaked renders also suggest the Galaxy S24 series colour options. The handsets are seen in black, gray, violet, and yellow shades with a hole punch display design and minimal bezels. The Galaxy S24 Ultra is seen with a flat back panel and a flat display with integrated S Pen. It appears to have a quad camera setup on the rear with all four cameras housed inside separate rings. The Galaxy S24 and the Galaxy S24+ are shown with triple rear cameras. The images indicate a similar design language to that of the Galaxy S23 series.\n" +
                "\n" +
                "The Galaxy S24 Ultra will be reportedly available in titanium black, titanium gray, titanium violet, and titanium yellow colour options, whereas the colour versions of Galaxy S24 and Galaxy S24+ could be called onyx black, marble grey, cobalt violet, and amber yellow.");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("Catagory", "Tech");
        hashMap.put("Image_url", "https://i.gadgets360cdn.com/large/samsung_galaxy_s23_series_1675273558643.jpg?downsize=950:*");
        hashMap.put("Title", "Samsung Galaxy S24, Galaxy S24+, Galaxy S24 Ultra Renders, Full Specifications Leak Online");
        hashMap.put("Description", "Samsung is gearing up to launch the next generation of Galaxy S series smartphones early next year. A series of leaks have already shed light on the features of the flagship smartphones ahead of the rumoured launch on January 17. Most recently, renders of the Galaxy S24, Galaxy S24+, and Galaxy S24 Ultra have leaked online along with their full specifications. Both Galaxy S24+ and Galaxy S24 Ultra are said to run on Snapdragon 8 Gen 3 SoC, paired with 12GB of RAM. The Galaxy S24, in contrast, is tipped to be powered by an Exynos 2400 chipset. The Galaxy S24 Ultra is expected to have a Titanium frame while the vanilla and Plus models could have an aluminium armour frame.\n" +
                "\n" +
                "Windows Report has leaked alleged renders and full specifications of the upcoming Galaxy S24, Galaxy S24+, and Galaxy S24 Ultra in a new report. The leaked renders also suggest the Galaxy S24 series colour options. The handsets are seen in black, gray, violet, and yellow shades with a hole punch display design and minimal bezels. The Galaxy S24 Ultra is seen with a flat back panel and a flat display with integrated S Pen. It appears to have a quad camera setup on the rear with all four cameras housed inside separate rings. The Galaxy S24 and the Galaxy S24+ are shown with triple rear cameras. The images indicate a similar design language to that of the Galaxy S23 series.\n" +
                "\n" +
                "The Galaxy S24 Ultra will be reportedly available in titanium black, titanium gray, titanium violet, and titanium yellow colour options, whereas the colour versions of Galaxy S24 and Galaxy S24+ could be called onyx black, marble grey, cobalt violet, and amber yellow.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("Catagory", "Tech");
        hashMap.put("Image_url", "https://i.gadgets360cdn.com/large/samsung_galaxy_s23_series_1675273558643.jpg?downsize=950:*");
        hashMap.put("Title", "Samsung Galaxy S24, Galaxy S24+, Galaxy S24 Ultra Renders, Full Specifications Leak Online");
        hashMap.put("Description", "Samsung is gearing up to launch the next generation of Galaxy S series smartphones early next year. A series of leaks have already shed light on the features of the flagship smartphones ahead of the rumoured launch on January 17. Most recently, renders of the Galaxy S24, Galaxy S24+, and Galaxy S24 Ultra have leaked online along with their full specifications. Both Galaxy S24+ and Galaxy S24 Ultra are said to run on Snapdragon 8 Gen 3 SoC, paired with 12GB of RAM. The Galaxy S24, in contrast, is tipped to be powered by an Exynos 2400 chipset. The Galaxy S24 Ultra is expected to have a Titanium frame while the vanilla and Plus models could have an aluminium armour frame.\n" +
                "\n" +
                "Windows Report has leaked alleged renders and full specifications of the upcoming Galaxy S24, Galaxy S24+, and Galaxy S24 Ultra in a new report. The leaked renders also suggest the Galaxy S24 series colour options. The handsets are seen in black, gray, violet, and yellow shades with a hole punch display design and minimal bezels. The Galaxy S24 Ultra is seen with a flat back panel and a flat display with integrated S Pen. It appears to have a quad camera setup on the rear with all four cameras housed inside separate rings. The Galaxy S24 and the Galaxy S24+ are shown with triple rear cameras. The images indicate a similar design language to that of the Galaxy S23 series.\n" +
                "\n" +
                "The Galaxy S24 Ultra will be reportedly available in titanium black, titanium gray, titanium violet, and titanium yellow colour options, whereas the colour versions of Galaxy S24 and Galaxy S24+ could be called onyx black, marble grey, cobalt violet, and amber yellow.");
        arrayList.add(hashMap);



    }

    //################################


}