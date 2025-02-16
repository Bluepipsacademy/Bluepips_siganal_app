package com.example.mymealmate.ui.history;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mymealmate.R;
import com.example.mymealmate.adapters.HistoryAdapter;
import com.example.mymealmate.models.HistoryModel;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends Fragment {

    RecyclerView recyclerView;
    List<HistoryModel> historyModels;
    HistoryAdapter historyAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_history, container,  false);

        recyclerView = root.findViewById(R.id.history_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        historyModels = new ArrayList<>();


        historyModels.add(new HistoryModel(R.drawable.back5, "Crypto","Buy/Sell","Profit/Loss","crypto"));
        historyModels.add(new HistoryModel(R.drawable.history5, "Forex","Buy/Sell","Profit/Loss", "forex"));
        historyModels.add(new HistoryModel(R.drawable.history3, "Synthetics","Buy/Sell","Profit/Loss", "synthetics"));
        historyModels.add(new HistoryModel(R.drawable.history4, "Stock","Buy/Sell","Profit/Loss","stock"));
        historyModels.add(new HistoryModel(R.drawable.com, "Commodities","Buy/Sell","Profit/Loss","commodities"));
        historyModels.add(new HistoryModel(R.drawable.coo, "Energy","Buy/Sell","Profit/Loss","energy"));


        historyAdapter = new HistoryAdapter(getContext(),historyModels);
        recyclerView.setAdapter(historyAdapter);
        historyAdapter.notifyDataSetChanged();






        return root;
    }


}