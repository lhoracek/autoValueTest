package cz.lhoracek.autovaluetest;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/**
 * Created by horaclu2 on 31/05/16.
 */

@AutoValue
public abstract class AutoValueClass implements Parcelable {

    public abstract String getName();

    public static TypeAdapter<AutoValueClass> typeAdapter(Gson gson) {
        return new AutoValue_AutoValueClass.GsonTypeAdapter(gson);
    }
}
