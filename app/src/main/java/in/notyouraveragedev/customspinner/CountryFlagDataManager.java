package in.notyouraveragedev.customspinner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by A Anand on 08-05-2020
 */
public class CountryFlagDataManager {

    private static final String[] countries = new String[] {
            "ad", "ae", "af", "ag", "ai", "al", "am", "ao", "ar", "at", "au", "ax", "az", "ba", "bb",
            "bd", "be", "bf", "bg", "bh", "bi", "bj", "bm", "bn", "bo", "br", "bs", "bt", "bw", "by",
            "bz", "ca", "caf", "cas", "cd", "ceu", "cf", "cg", "ch", "ch", "ci", "cl", "cm", "cn",
            "cna", "co", "coc", "cr", "csa", "cu", "cv", "cy", "cz", "de", "dj", "dk", "dm", "dz", "ec",
            "ee", "eg", "er", "es", "et", "eu", "fi", "fj", "fm", "fr", "ga", "gb", "gd", "ge", "gh",
            "gm", "gn", "gq", "gr", "gt", "gw", "gy", "hk", "hn", "hr", "ht", "hu", "id", "ie", "il",
            "in", "iq", "ir", "is", "it", "jm", "jo", "jp", "ke", "kg", "kh", "km", "kn", "kp", "kr",
            "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma",
            "mc", "md", "me", "mg", "mk", "ml", "mm", "mn", "mo", "mr", "ms", "mt", "mu", "mv", "mw",
            "mx", "my", "mz", "na", "ne", "ng", "ni", "nl", "no", "np", "nz", "om", "pa", "pe", "pg",
            "ph", "pk", "pl", "pr", "pt", "pw", "py", "qa", "ro", "rs", "ru", "rw", "sa", "sb", "sc",
            "sd", "se", "sg", "si", "sk", "sl", "sm", "sn", "so", "sr", "st", "sv", "sy", "sz", "tc",
            "td", "tg", "th", "tj", "tl", "tm", "tn", "to", "tr", "tt", "tw", "tz", "ua", "ug", "us",
            "uy", "uz", "vc", "ve", "vg", "vn", "ws", "ww", "ye", "za", "zw"
    };

   public static List<CustomSpinnerData> getAllCountriesFlags(Context context){
       Resources resources = context.getResources();
       List<CustomSpinnerData> returnList = new ArrayList<>();
       for(String country: countries){
           returnList.add(new CustomSpinnerData(country,
                   resources.getIdentifier(country, "drawable",   context.getPackageName())));
       }
       return returnList;
   }
}
