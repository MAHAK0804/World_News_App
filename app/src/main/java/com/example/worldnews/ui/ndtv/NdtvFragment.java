package com.example.worldnews.ui.ndtv;

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
import com.example.worldnews.databinding.FragmentGalleryBinding;

public class NdtvFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NdtvViewModel ndtvViewModel =
                new ViewModelProvider(this).get(NdtvViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button btn = root.findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_gallery_to_bbc);
            }
        });
        WebView webView = root.findViewById(R.id.webviewNDTV);
        webView.loadUrl("https://www.ndtv.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}