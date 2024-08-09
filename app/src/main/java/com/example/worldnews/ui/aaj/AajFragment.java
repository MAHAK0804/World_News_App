package com.example.worldnews.ui.aaj;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.worldnews.R;
import com.example.worldnews.WebViewController;
import com.example.worldnews.databinding.FragmentHomeBinding;

public class AajFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AajViewModel aajViewModel =
                new ViewModelProvider(this).get(AajViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webView = root.findViewById(R.id.webViewAaj);
        webView.loadUrl("https://www.aajtak.in/");

        webView.setWebViewClient(new WebViewController());

//        final TextView textView = binding.textHome;
//        aajViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}