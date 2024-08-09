package com.example.worldnews.ui.bbc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.worldnews.R;
import com.example.worldnews.WebViewController;
import com.example.worldnews.databinding.FragmentSlideshowBinding;

public class BbcFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BbcViewModel bbcViewModel =
                new ViewModelProvider(this).get(BbcViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button btn = root.findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_bbc_to_zee);
            }
        });

        WebView webView = root.findViewById(R.id.webViewBBC);
        webView.loadUrl("https://www.bbc.com/news");
        webView.setWebViewClient(new WebViewController());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}