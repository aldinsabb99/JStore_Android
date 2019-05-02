package com.jstore.user.jstore_android_aldinisarahmasabillah;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
public class MenuRequest extends StringRequest
{
    private static final String Regis_URL = "http://10.0.2.2/item";
    private Map<String, String> params;

    public MenuRequest(int id, Response.Listener<String> listener)
    {
        super(Method.GET, Regis_URL, listener, null);
        params = new HashMap<>();
        params.put("id", Integer.toString(id));
    }

    @Override
    public Map<String, String> getParams()
    {
        return  params;
    }

}
