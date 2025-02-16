package com.example.mymealmate.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymealmate.R;
import com.example.mymealmate.adapters.HomeHorAdapter;
import com.example.mymealmate.adapters.HomeVerAdapter;
import com.example.mymealmate.models.HomeHorModel;
import com.example.mymealmate.models.HomeVerModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DashboardFragment extends Fragment {

    RecyclerView homeHorizontalRec, homeVerticalRec;
    List<HomeHorModel> homeHorModelList;
    
   
    HomeHorAdapter homeHorAdapter;


    ///////////////////Vertical
    List<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container,  false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);


        ////////////////Horizontal RecyclerView
        homeHorModelList = new ArrayList<>();

        String name = "Crypto Update";
        homeHorModelList.add(new HomeHorModel(R.drawable.chart, name));
        String name2 = "Forex Updates";
        homeHorModelList.add(new HomeHorModel(R.drawable.history4, name2));
        String name3 = "News";
        homeHorModelList.add(new HomeHorModel(R.drawable.chart3, name3));
        String name4 = "Marketplace";
        homeHorModelList.add(new HomeHorModel(R.drawable.chart2, name4));


        homeHorAdapter = new HomeHorAdapter(getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));


        ////////////////Vertical RecyclerView
        homeVerModelList = new ArrayList<>();

        String name1 = "Crypto Updates";
        String time = "01/02/2025";
        String more = "Read More";
        String last = "Rate Us";
        homeVerModelList.add(new HomeVerModel(R.drawable.chart,name1,time,more,last));

        String name5 = "Forex Updates";
        String time2 = "01/02/2025";
        String more2 = "Read More";
        String last2 = "Rate Us";
        homeVerModelList.add(new HomeVerModel(R.drawable.history5,name5,time2,more2,last2));

        String name6 = "News";
        String time3 = "01/02/2025";
        String more3 = "Read More";
        String last3 = "Rate Us";
        homeVerModelList.add(new HomeVerModel(R.drawable.history4,name6,time3,more3,last3));

        String name7 = "Marketplace";
        String time4 = "01/02/2025";
        String more4 = "Read More";
        String last4 = "Rate Us";
        homeVerModelList.add(new HomeVerModel(R.drawable.history6,name7,time4,more4,last4));


        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity()));
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);
        return root;
    }


}