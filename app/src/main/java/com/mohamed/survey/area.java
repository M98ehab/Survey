package com.mohamed.survey;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mohamed on 12/16/2017.
 */

public class area extends Fragment {

    TextView result;
    EditText distance,columns,height1,height2,height3,height4,height5,height6,height7,height8,height9,height10,
            height11,height12,height13,height14,height15;
    Button area;
    Button input;
    double result_num;
    double d,c,h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14,h15;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.area,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Calculate areas");
        result = (TextView)view.findViewById(R.id.result);
        distance=(EditText)view.findViewById(R.id.editText);
        columns=(EditText)view.findViewById(R.id.columns);
        height1=(EditText)view.findViewById(R.id.h1);
        height2=(EditText)view.findViewById(R.id.h2);
        height3=(EditText)view.findViewById(R.id.h3);
        height4=(EditText)view.findViewById(R.id.h4);
        height5=(EditText)view.findViewById(R.id.h5);
        height6=(EditText)view.findViewById(R.id.h6);
        height7=(EditText)view.findViewById(R.id.h7);
        height8=(EditText)view.findViewById(R.id.h8);
        height9=(EditText)view.findViewById(R.id.h9);
        height10=(EditText)view.findViewById(R.id.h10);
        height11=(EditText)view.findViewById(R.id.h11);
        height12=(EditText)view.findViewById(R.id.h12);
        height13=(EditText)view.findViewById(R.id.h13);
        height14=(EditText)view.findViewById(R.id.h14);
        height15=(EditText)view.findViewById(R.id.h15);
        input=(Button)view.findViewById(R.id.button4);
        area=(Button)view.findViewById(R.id.button1);

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d=Double.parseDouble(distance.getText().toString());
                c=Double.parseDouble(columns.getText().toString());
                if(c==1) {
                    height1.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            result_num=(d/2)*(h1);
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==2){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            result_num=(d/2)*((h1+h2));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==3){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            result_num=(d/2)*((h1+h3+2*(h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==4){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            result_num=(d/2)*((h1+h4+2*(h3+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==5){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            result_num=(d/2)*((h1+h5+2*(h3+h4+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==6){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    height6.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            h6=Double.parseDouble(height6.getText().toString());
                            result_num=(d/2)*((h1+h6+2*(h3+h4+h5+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==7){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    height6.setVisibility(View.VISIBLE);
                    height7.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            h6=Double.parseDouble(height6.getText().toString());
                            h7=Double.parseDouble(height7.getText().toString());
                            result_num=(d/2)*((h1+h7+2*(h3+h4+h5+h6+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==8){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    height6.setVisibility(View.VISIBLE);
                    height7.setVisibility(View.VISIBLE);
                    height8.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            h6=Double.parseDouble(height6.getText().toString());
                            h7=Double.parseDouble(height7.getText().toString());
                            h8=Double.parseDouble(height8.getText().toString());
                            result_num=(d/2)*((h1+h8+2*(h3+h4+h5+h6+h7+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==9){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    height6.setVisibility(View.VISIBLE);
                    height7.setVisibility(View.VISIBLE);
                    height8.setVisibility(View.VISIBLE);
                    height9.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            h6=Double.parseDouble(height6.getText().toString());
                            h7=Double.parseDouble(height7.getText().toString());
                            h8=Double.parseDouble(height8.getText().toString());
                            h9=Double.parseDouble(height9.getText().toString());
                            result_num=(d/2)*((h1+h9+2*(h3+h4+h5+h6+h7+h8+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==10){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    height6.setVisibility(View.VISIBLE);
                    height7.setVisibility(View.VISIBLE);
                    height8.setVisibility(View.VISIBLE);
                    height9.setVisibility(View.VISIBLE);
                    height10.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            h6=Double.parseDouble(height6.getText().toString());
                            h7=Double.parseDouble(height7.getText().toString());
                            h8=Double.parseDouble(height8.getText().toString());
                            h9=Double.parseDouble(height9.getText().toString());
                            h10=Double.parseDouble(height10.getText().toString());
                            result_num=(d/2)*((h1+h10+2*(h3+h4+h5+h6+h7+h8+h9+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==11){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    height6.setVisibility(View.VISIBLE);
                    height7.setVisibility(View.VISIBLE);
                    height8.setVisibility(View.VISIBLE);
                    height9.setVisibility(View.VISIBLE);
                    height10.setVisibility(View.VISIBLE);
                    height11.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            h6=Double.parseDouble(height6.getText().toString());
                            h7=Double.parseDouble(height7.getText().toString());
                            h8=Double.parseDouble(height8.getText().toString());
                            h9=Double.parseDouble(height9.getText().toString());
                            h10=Double.parseDouble(height10.getText().toString());
                            h11=Double.parseDouble(height11.getText().toString());
                            result_num=(d/2)*((h1+h11+2*(h3+h4+h5+h6+h7+h8+h9+h10+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==12){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    height6.setVisibility(View.VISIBLE);
                    height7.setVisibility(View.VISIBLE);
                    height8.setVisibility(View.VISIBLE);
                    height9.setVisibility(View.VISIBLE);
                    height10.setVisibility(View.VISIBLE);
                    height11.setVisibility(View.VISIBLE);
                    height12.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            h6=Double.parseDouble(height6.getText().toString());
                            h7=Double.parseDouble(height7.getText().toString());
                            h8=Double.parseDouble(height8.getText().toString());
                            h9=Double.parseDouble(height9.getText().toString());
                            h10=Double.parseDouble(height10.getText().toString());
                            h11=Double.parseDouble(height11.getText().toString());
                            h12=Double.parseDouble(height12.getText().toString());
                            result_num=(d/2)*((h1+h12+2*(h3+h4+h5+h6+h7+h8+h9+h10+h11+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==13){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    height6.setVisibility(View.VISIBLE);
                    height7.setVisibility(View.VISIBLE);
                    height8.setVisibility(View.VISIBLE);
                    height9.setVisibility(View.VISIBLE);
                    height10.setVisibility(View.VISIBLE);
                    height11.setVisibility(View.VISIBLE);
                    height12.setVisibility(View.VISIBLE);
                    height13.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h13=Double.parseDouble(height13.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            h6=Double.parseDouble(height6.getText().toString());
                            h7=Double.parseDouble(height7.getText().toString());
                            h8=Double.parseDouble(height8.getText().toString());
                            h9=Double.parseDouble(height9.getText().toString());
                            h10=Double.parseDouble(height10.getText().toString());
                            h11=Double.parseDouble(height11.getText().toString());
                            h12=Double.parseDouble(height12.getText().toString());
                            result_num=(d/2)*((h1+h13+2*(h3+h4+h5+h6+h7+h8+h9+h10+h11+h12+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==14){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    height6.setVisibility(View.VISIBLE);
                    height7.setVisibility(View.VISIBLE);
                    height8.setVisibility(View.VISIBLE);
                    height9.setVisibility(View.VISIBLE);
                    height10.setVisibility(View.VISIBLE);
                    height11.setVisibility(View.VISIBLE);
                    height12.setVisibility(View.VISIBLE);
                    height13.setVisibility(View.VISIBLE);
                    height14.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h6=Double.parseDouble(height6.getText().toString());
                            h7=Double.parseDouble(height7.getText().toString());
                            h8=Double.parseDouble(height8.getText().toString());
                            h9=Double.parseDouble(height9.getText().toString());
                            h10=Double.parseDouble(height10.getText().toString());
                            h11=Double.parseDouble(height11.getText().toString());
                            h12=Double.parseDouble(height12.getText().toString());
                            h13=Double.parseDouble(height13.getText().toString());
                            h14=Double.parseDouble(height14.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            result_num=(d/2)*((h1+h14+2*(h3+h4+h5+h6+h7+h8+h9+h10+h11+h12+h13+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if (c==15){
                    height1.setVisibility(View.VISIBLE);
                    height2.setVisibility(View.VISIBLE);
                    height3.setVisibility(View.VISIBLE);
                    height4.setVisibility(View.VISIBLE);
                    height5.setVisibility(View.VISIBLE);
                    height6.setVisibility(View.VISIBLE);
                    height7.setVisibility(View.VISIBLE);
                    height8.setVisibility(View.VISIBLE);
                    height9.setVisibility(View.VISIBLE);
                    height10.setVisibility(View.VISIBLE);
                    height11.setVisibility(View.VISIBLE);
                    height12.setVisibility(View.VISIBLE);
                    height13.setVisibility(View.VISIBLE);
                    height14.setVisibility(View.VISIBLE);
                    height15.setVisibility(View.VISIBLE);
                    area.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            h1=Double.parseDouble(height1.getText().toString());
                            h2=Double.parseDouble(height2.getText().toString());
                            h3=Double.parseDouble(height3.getText().toString());
                            h4=Double.parseDouble(height4.getText().toString());
                            h5=Double.parseDouble(height5.getText().toString());
                            h6=Double.parseDouble(height6.getText().toString());
                            h7=Double.parseDouble(height7.getText().toString());
                            h8=Double.parseDouble(height8.getText().toString());
                            h9=Double.parseDouble(height9.getText().toString());
                            h10=Double.parseDouble(height10.getText().toString());
                            h11=Double.parseDouble(height11.getText().toString());
                            h12=Double.parseDouble(height12.getText().toString());
                            h13=Double.parseDouble(height13.getText().toString());
                            h14=Double.parseDouble(height14.getText().toString());
                            h15=Double.parseDouble(height15.getText().toString());
                            result_num=(d/2)*((h1+h15+2*(h3+h4+h5+h6+h7+h8+h9+h10+h11+h12+h13+h14+h2)));
                            result.setText(String.valueOf(result_num));
                        }
                    });
                }if(c>15 ||c<=0){
                    Toast.makeText(getContext(), "Enter number between 1 and 15!",Toast.LENGTH_SHORT).show();

                }
                }
        });

    }
}
