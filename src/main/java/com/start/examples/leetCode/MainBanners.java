package com.start.examples.leetCode;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBanners {
    public static void main(String[] args) {

        Banner b1 = new Banner(1,1.2f);
        Banner b2 = new Banner(2,2f);
        Banner b3 = new Banner(3,3f);

        List<Banner> bannerList = new ArrayList<>(Arrays.asList(b1,b2,b3));
        //bannerList.stream().

        int increase = 0;



    }

    @Getter
    @Setter
    private static   class Banner {
        int id;
        float weight;

        public Banner(int id, float weight) {
            this.id = id;
            this.weight = weight;
        }
    }

}
