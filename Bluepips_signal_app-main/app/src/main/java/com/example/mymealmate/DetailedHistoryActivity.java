package com.example.mymealmate;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymealmate.adapters.DetailedHistoryAdapter;
import com.example.mymealmate.models.DetailedHistoryModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedHistoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedHistoryModel> detailedHistoryModelList;
    DetailedHistoryAdapter historyAdapter;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_history);

        String type = getIntent().getStringExtra("type");


        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedHistoryModelList = new ArrayList<>();
        historyAdapter = new DetailedHistoryAdapter(detailedHistoryModelList);
        recyclerView.setAdapter(historyAdapter);


        if (type != null && type.equalsIgnoreCase("crypto")){

            imageView.setImageResource(R.drawable.blockchain);
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.back5, "BTCUST", "Buy: Opened at Jan 29, 09:30am", "Target 1    0.22968+   12.04%+", "Target 2    0.22968+   12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.bback, "USDT", "Buy: Opened at Jan 28, 09:30am", "Target 1    0.22968+   12.04%+", "Target 2    0.22968+   12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.bbback, "ETHUSD", "Buy: Opened at Jan 27, 09:30am", " Target 1    0.22968+   12.04%+", "Target 2    0.22968+   12.04%+","Stop 0.185"));
            historyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("forex")){

            imageView.setImageResource(R.drawable.history);
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history5, "GBPJPY", "Buy: Opened at Jan 29, 09:30am", "Target 1    0.22968+   12.04%+", "Target 2    0.22968+   12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history6, "GBPUSD", "Buy: Opened at Jan 28, 09:30am", "Target 1    0.22968+   12.04%+", "Target 2    0.22968+   12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.chart2, "USDJPY", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            historyAdapter.notifyDataSetChanged();
        }


        if (type != null && type.equalsIgnoreCase("synthetics")){

            imageView.setImageResource(R.drawable.history3);
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history3, "VIX100", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history3, "STEP 500", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history3, "STEP 200", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            historyAdapter.notifyDataSetChanged();

        }

        if (type != null && type.equalsIgnoreCase("Stock")){

            imageView.setImageResource(R.drawable.coo);
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history5, "SWISS 20", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history6, "UK 100", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.chart2, "WALL STREET 30", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            historyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("commodities")){

            imageView.setImageResource(R.drawable.com);
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history5, "XAUUSD", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history6, "XAGUSD", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.chart2, "XAGAUD", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            historyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("energy")){

            imageView.setImageResource(R.drawable.history6);
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history5, "USOIL", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.history6, "UKOIL", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            detailedHistoryModelList.add(new DetailedHistoryModel(R.drawable.chart2, "NGAS", "Buy: Opened at Jan 27, 09:30am", "Target 1      0.22968+     12.04%+", "Target 2      0.22968+     12.04%+","Stop 0.185"));
            historyAdapter.notifyDataSetChanged();
        }



    }
}