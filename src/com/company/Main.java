package com.company;

import com.company.familu.AbstractHouse;
import com.company.familu.Apartmant;
import com.company.familu.Family;
import com.company.familu.Hotel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbstractHouse apt = new Apartmant("Vafsc", 234);
        ArrayList<String> members = new ArrayList<>();
        members.add("Kim Namjun");
        members.add("Kim Soekjin");
        Family kims = new Family(members, apt);

        ArrayList<String> mm = new ArrayList<>();
        mm.add("Ween Bred");
        mm.add("Ween Sam");
        Family weens = new Family(mm, apt);

        AbstractHouse hotel = new Hotel("GFYKHT", 2312);
        ArrayList<String> mm2 = new ArrayList<>();
        mm2.add("Coul Dyc");
        mm2.add("Coul Emma");
        Family couls = new Family(mm2, hotel);

        kims.live();
        weens.live();
        couls.live();

        List<Family> fammy = new ArrayList<>();
        fammy.add(kims);
        fammy.add(weens);
        fammy.add(couls);

        int aptSum = 0, hotelSum = 0;
        for (Family fam : fammy){
            if (fam.getHomeadresse() instanceof Apartmant){
                aptSum += fam.getFamilyMembersNumber();
            }
            else if (fam.getHomeadresse() instanceof Hotel){
                hotelSum += fam.getFamilyMembersNumber();
            }
        }
        System.out.println("Apt total: " + aptSum);
        System.out.println("Hotel total: " + hotelSum);
    }
}
