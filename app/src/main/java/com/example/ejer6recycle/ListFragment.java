package com.example.ejer6recycle;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.ejer6recycle.databinding.FragmentListBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {
    private FragmentListBinding binding;
    private List<String> words = new ArrayList<>();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentListBinding.inflate(getActivity().getLayoutInflater());

        MyWordsAdapter adapter= new MyWordsAdapter();
        adapter.setData(getDataWords());

        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext()));
        binding.recyclerView.addItemDecoration(new DividerItemDecoration(binding.recyclerView.getContext(), DividerItemDecoration.VERTICAL));
        initListener();

        return binding.getRoot();
    }



    private void initListener() {

        binding.floatingActionButton.setOnClickListener( v->{

            words.add(ramdonFruit());
            binding.recyclerView.getAdapter().notifyItemInserted(words.size());
            binding.recyclerView.smoothScrollToPosition(words.size());

        });
    }

    private String ramdonFruit() {
        List<String> fruit = new ArrayList<>();
        fruit.add("Frambuesa");
        fruit.add("Fresa");
        fruit.add("Grosella espinosa");
        fruit.add("Grosella negra");
        fruit.add("Grosella roja");
        fruit.add("Limón");
        fruit.add("Mandarina");
        fruit.add("Naranja");
        fruit.add("Pomelo");
        fruit.add("Aguacate");
        fruit.add("Carambola");
        fruit.add("Chirimoya");
        fruit.add("Coco");
        fruit.add("Dátil");
        fruit.add("Fruta de la pasión");
        fruit.add("Kiwi");
        fruit.add("Litchi");
        fruit.add("Papaya");
        fruit.add("Piña");
        fruit.add("Albaricoque");
        fruit.add("Cereza");
        fruit.add("Ciruela");
        fruit.add("Higo");
        fruit.add("Kaki");
        fruit.add("Manzana");
        fruit.add("Nectarina");
        fruit.add("Níspero");
        fruit.add("Uva");
        fruit.add("Almendra");
        fruit.add("Avellana");
        fruit.add("Cacahuete");
        fruit.add("Castaña");
        fruit.add("Nuez");
        fruit.add("Pistacho");
        int size = fruit.size();

        Random random = new Random();
        int randomIndex = random.nextInt(fruit.size());


        //Log.e("ramdonFruit: ", "SS"+String.valueOf(randomIndex));

        return fruit.get(randomIndex);

    }


    private List<String>  getDataWords(){
        words.add("sandia");
        words.add("manzana");
        words.add("melon");
        words.add("banana");
        words.add("pera");
        words.add("naranja");
        words.add("mora");
        words.add("arandanos");
        words.add("melocoton");
        words.add("damasco");
        words.add("maracuya");
        words.add("pomelo");

 return  words;

    }
}