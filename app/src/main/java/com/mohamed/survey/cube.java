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

public class cube extends Fragment {
    TextView dx1,dx2,dx3,dx4,dx5,dx6,dx7,dy1,dy2,dy3,dy4,dy5,dy6,dy7,closing,lengths,bearings,dx,dy;
    EditText sides,l1,l2,l3,l4,l5,l6,l7,b1,b2,b3,b4,b5,b6,b7;
    Button enter,calc,error;
    float x1,x2,x3,x4,x5,x6,x7,y1,y2,y3,y4,y5,y6,y7,r,
     s,d1,d2,d3,d4,d5,d6,d7,z1,z2,z3,z4,z5,z6,z7,m1,m2,m3,m4,m5,m6,m7,n1,n2,n3,n4,n5,n6,n7,sum1,sum2,sum3,sum4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cubes,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Adjustment of Traverse");
        dx=(TextView)view.findViewById(R.id.dx);
        dy=(TextView)view.findViewById(R.id.dy);
        lengths=(TextView)view.findViewById(R.id.lengths);
        bearings=(TextView)view.findViewById(R.id.bearings);
        dx1=(TextView)view.findViewById(R.id.dx1);
        dx2=(TextView)view.findViewById(R.id.dx2);
        dx3=(TextView)view.findViewById(R.id.dx3);
        dx4=(TextView)view.findViewById(R.id.dx4);
        dx5=(TextView)view.findViewById(R.id.dx5);
        dx6=(TextView)view.findViewById(R.id.dx6);
        dx7=(TextView)view.findViewById(R.id.dx7);
        dy1=(TextView)view.findViewById(R.id.dy1);
        dy2=(TextView)view.findViewById(R.id.dy2);
        dy3=(TextView)view.findViewById(R.id.dy3);
        dy4=(TextView)view.findViewById(R.id.dy4);
        dy5=(TextView)view.findViewById(R.id.dy5);
        dy6=(TextView)view.findViewById(R.id.dy6);
        dy7=(TextView)view.findViewById(R.id.dy7);
        closing=(TextView)view.findViewById(R.id.closing);
        sides=(EditText)view.findViewById(R.id.sides);
        l1=(EditText)view.findViewById(R.id.l1);
        l2=(EditText)view.findViewById(R.id.l2);
        l3=(EditText)view.findViewById(R.id.l3);
        l4=(EditText)view.findViewById(R.id.l4);
        l5=(EditText)view.findViewById(R.id.l5);
        l6=(EditText)view.findViewById(R.id.l6);
        l7=(EditText)view.findViewById(R.id.l7);
        b1=(EditText)view.findViewById(R.id.b1);
        b2=(EditText)view.findViewById(R.id.b2);
        b3=(EditText)view.findViewById(R.id.b3);
        b4=(EditText)view.findViewById(R.id.b4);
        b5=(EditText)view.findViewById(R.id.b5);
        b6=(EditText)view.findViewById(R.id.b6);
        b7=(EditText)view.findViewById(R.id.b7);
        enter=(Button)view.findViewById(R.id.enter);
        calc=(Button)view.findViewById(R.id.calc);
        error=(Button)view.findViewById(R.id.error);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=Integer.parseInt(sides.getText().toString());
            if(s==3){
                lengths.setVisibility(View.VISIBLE);
                bearings.setVisibility(View.VISIBLE);
                calc.setVisibility(View.VISIBLE);
                error.setVisibility(View.VISIBLE);
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.VISIBLE);
                l3.setVisibility(View.VISIBLE);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                calc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dx.setVisibility(View.VISIBLE);
                        dy.setVisibility(View.VISIBLE);
                        d1=Float.parseFloat(l1.getText().toString());
                        d2=Float.parseFloat(l2.getText().toString());
                        d3=Float.parseFloat(l3.getText().toString());
                        z1=Float.parseFloat(b1.getText().toString());
                        z2=Float.parseFloat(b2.getText().toString());
                        z3=Float.parseFloat(b3.getText().toString());
                        sum1=d1+d2+d3;
                        m1= (float) (d1*(Math.sin(Math.toRadians(z1))));
                        m2= (float) (d2*(Math.sin(Math.toRadians(z2))));
                        m3= (float) (d3*(Math.sin(Math.toRadians(z3))));
                        sum2=m1+m2+m3;
                        n1= (float) (d1*(Math.cos(Math.toRadians(z1))));
                        n2= (float) (d2*(Math.cos(Math.toRadians(z2))));
                        n3= (float) (d3*(Math.cos(Math.toRadians(z3))));
                        sum3=n1+n2+n3;
                        x1=(d1*(-sum2/sum1))+(m1);
                        x2=(d2*(-sum2/sum1))+(m2);
                        x3=(d3*(-sum2/sum1))+(m3);
                        dx1.setText(String.valueOf(x1));
                        dx2.setText(String.valueOf(x2));
                        dx3.setText(String.valueOf(x3));
                        y1=(d1*(-sum3/sum1))+(n1);
                        y2=(d2*(-sum3/sum1))+(n2);
                        y3=(d3*(-sum3/sum1))+(n3);
                        dy1.setText(String.valueOf(y1));
                        dy2.setText(String.valueOf(y2));
                        dy3.setText(String.valueOf(y3));

                        error.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sum4= (float) Math.sqrt((sum2*sum2)+(sum3*sum3));
                                closing.setText(String.valueOf(sum4));
                            }
                        });

                    }
                });


            }if(s==4){
                    lengths.setVisibility(View.VISIBLE);
                    bearings.setVisibility(View.VISIBLE);
                    calc.setVisibility(View.VISIBLE);
                    error.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b3.setVisibility(View.VISIBLE);
                    b4.setVisibility(View.VISIBLE);
                    calc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dx.setVisibility(View.VISIBLE);
                            dy.setVisibility(View.VISIBLE);
                            d1=Float.parseFloat(l1.getText().toString());
                            d2=Float.parseFloat(l2.getText().toString());
                            d3=Float.parseFloat(l3.getText().toString());
                            d4=Float.parseFloat(l4.getText().toString());
                            z1=Float.parseFloat(b1.getText().toString());
                            z2=Float.parseFloat(b2.getText().toString());
                            z3=Float.parseFloat(b3.getText().toString());
                            z4=Float.parseFloat(b4.getText().toString());
                            sum1=d1+d2+d3+d4;
                            m1= (float) (d1*Math.sin(Math.toRadians(z1)));
                            m2= (float) (d2*Math.sin(Math.toRadians(z2)));
                            m3= (float) (d3*Math.sin(Math.toRadians(z3)));
                            m4= (float) (d4*Math.sin(Math.toRadians(z4)));
                            sum2=m1+m2+m3+m4;
                            n1= (float) (d1*Math.cos(Math.toRadians(z1)));
                            n2= (float) (d2*Math.cos(Math.toRadians(z2)));
                            n3= (float) (d3*Math.cos(Math.toRadians(z3)));
                            n4= (float) (d4*Math.cos(Math.toRadians(z4)));
                            sum3=n1+n2+n3+n4;
                            x1=(d1*(-sum2/sum1))+(m1);
                            x2=(d2*(-sum2/sum1))+(m2);
                            x3=(d3*(-sum2/sum1))+(m3);
                            x4=(d4*(-sum2/sum1))+(m4);
                            dx1.setText(String.valueOf(x1));
                            dx2.setText(String.valueOf(x2));
                            dx3.setText(String.valueOf(x3));
                            dx4.setText(String.valueOf(x4));
                            y1=(d1*(-sum3/sum1))+(n1);
                            y2=(d2*(-sum3/sum1))+(n2);
                            y3=(d3*(-sum3/sum1))+(n3);
                            y4=(d4*(-sum3/sum1))+(n4);
                            dy1.setText(String.valueOf(y1));
                            dy2.setText(String.valueOf(y2));
                            dy3.setText(String.valueOf(y3));
                            dy4.setText(String.valueOf(y4));

                            error.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    sum4= (float) Math.sqrt((sum2*sum2)+(sum3*sum3));
                                    closing.setText(String.valueOf(sum4));
                                }
                            });

                        }
                    });

                }if(s==5){
                    lengths.setVisibility(View.VISIBLE);
                    bearings.setVisibility(View.VISIBLE);
                    calc.setVisibility(View.VISIBLE);
                    error.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.VISIBLE);
                    l5.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b3.setVisibility(View.VISIBLE);
                    b4.setVisibility(View.VISIBLE);
                    b5.setVisibility(View.VISIBLE);
                    calc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dx.setVisibility(View.VISIBLE);
                            dy.setVisibility(View.VISIBLE);
                            d1=Float.parseFloat(l1.getText().toString());
                            d2=Float.parseFloat(l2.getText().toString());
                            d3=Float.parseFloat(l3.getText().toString());
                            d4=Float.parseFloat(l4.getText().toString());
                            d5=Float.parseFloat(l5.getText().toString());
                            z1=Float.parseFloat(b1.getText().toString());
                            z2=Float.parseFloat(b2.getText().toString());
                            z3=Float.parseFloat(b3.getText().toString());
                            z4=Float.parseFloat(b4.getText().toString());
                            z5=Float.parseFloat(b5.getText().toString());
                            sum1=d1+d2+d3+d4+d5;
                            m1= (float) (d1*Math.sin(Math.toRadians(z1)));
                            m2= (float) (d2*Math.sin(Math.toRadians(z2)));
                            m3= (float) (d3*Math.sin(Math.toRadians(z3)));
                            m4= (float) (d4*Math.sin(Math.toRadians(z4)));
                            m5= (float) (d5*Math.sin(Math.toRadians(z5)));
                            sum2=m1+m2+m3+m4+m5;
                            n1= (float) (d1*Math.cos(Math.toRadians(z1)));
                            n2= (float) (d2*Math.cos(Math.toRadians(z2)));
                            n3= (float) (d3*Math.cos(Math.toRadians(z3)));
                            n4= (float) (d4*Math.cos(Math.toRadians(z4)));
                            n5= (float) (d5*Math.cos(Math.toRadians(z5)));
                            sum3=n1+n2+n3+n4+n5;
                            x1=(d1*(-sum2/sum1)+(m1));
                            x2=(d2*(-sum2/sum1))+(m2);
                            x3=(d3*(-sum2/sum1))+(m3);
                            x4=(d4*(-sum2/sum1))+(m4);
                            x5=(d5*(-sum2/sum1))+(m5);
                            dx1.setText(String.valueOf(x1));
                            dx2.setText(String.valueOf(x2));
                            dx3.setText(String.valueOf(x3));
                            dx4.setText(String.valueOf(x4));
                            dx5.setText(String.valueOf(x5));
                            y1=(d1*(-sum3/sum1))+(n1);
                            y2=(d2*(-sum3/sum1))+(n2);
                            y3=(d3*(-sum3/sum1))+(n3);
                            y4=(d4*(-sum3/sum1))+(n4);
                            y5=(d5*(-sum3/sum1))+(n5);
                            dy1.setText(String.valueOf(n1));
                            dy2.setText(String.valueOf(n2));
                            dy3.setText(String.valueOf(n3));
                            dy4.setText(String.valueOf(n4));
                            dy5.setText(String.valueOf(n5));

                            error.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    sum4= (float) Math.sqrt((sum2*sum2)+(sum3*sum3));
                                    closing.setText(String.valueOf(sum4));
                                }
                            });

                        }
                    });
                }if (s==6){
                    lengths.setVisibility(View.VISIBLE);
                    bearings.setVisibility(View.VISIBLE);
                    calc.setVisibility(View.VISIBLE);
                    error.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.VISIBLE);
                    l5.setVisibility(View.VISIBLE);
                    l6.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b3.setVisibility(View.VISIBLE);
                    b4.setVisibility(View.VISIBLE);
                    b5.setVisibility(View.VISIBLE);
                    b6.setVisibility(View.VISIBLE);
                    calc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dx.setVisibility(View.VISIBLE);
                            dy.setVisibility(View.VISIBLE);
                            d1=Float.parseFloat(l1.getText().toString());
                            d2=Float.parseFloat(l2.getText().toString());
                            d3=Float.parseFloat(l3.getText().toString());
                            d4=Float.parseFloat(l4.getText().toString());
                            d5=Float.parseFloat(l5.getText().toString());
                            d6=Float.parseFloat(l6.getText().toString());
                            z1=Float.parseFloat(b1.getText().toString());
                            z2=Float.parseFloat(b2.getText().toString());
                            z3=Float.parseFloat(b3.getText().toString());
                            z4=Float.parseFloat(b4.getText().toString());
                            z5=Float.parseFloat(b5.getText().toString());
                            z6=Float.parseFloat(b6.getText().toString());
                            sum1=d1+d2+d3+d4+d5+d6;
                            m1= (float) (d1*Math.sin(Math.toRadians(z1)));
                            m2= (float) (d2*Math.sin(Math.toRadians(z2)));
                            m3= (float) (d3*Math.sin(Math.toRadians(z3)));
                            m4= (float) (d4*Math.sin(Math.toRadians(z4)));
                            m5= (float) (d5*Math.sin(Math.toRadians(z5)));
                            m6= (float) (d6*Math.sin(Math.toRadians(z6)));
                            sum2=m1+m2+m3+m4+m5+m6;
                            n1= (float) (d1*Math.cos(Math.toRadians(z1)));
                            n2= (float) (d2*Math.cos(Math.toRadians(z2)));
                            n3= (float) (d3*Math.cos(Math.toRadians(z3)));
                            n4= (float) (d4*Math.cos(Math.toRadians(z4)));
                            n5= (float) (d5*Math.cos(Math.toRadians(z5)));
                            n6= (float) (d6*Math.cos(Math.toRadians(z6)));
                            sum3=n1+n2+n3+n4+n5+n6;
                            x1=(d1*(-sum2/sum1))+(m1);
                            x2=(d2*(-sum2/sum1))+(m2);
                            x3=(d3*(-sum2/sum1))+(m3);
                            x4=(d4*(-sum2/sum1))+(m4);
                            x5=(d5*(-sum2/sum1))+(m5);
                            x6=(d6*(-sum2/sum1))+(m6);
                            dx1.setText(String.valueOf(x1));
                            dx2.setText(String.valueOf(x2));
                            dx3.setText(String.valueOf(x3));
                            dx4.setText(String.valueOf(x4));
                            dx5.setText(String.valueOf(x5));
                            dx6.setText(String.valueOf(x6));
                            y1=(d1*(-sum3/sum1))+(n1);
                            y2=(d2*(-sum3/sum1))+(n2);
                            y3=(d3*(-sum3/sum1))+(n3);
                            y4=(d4*(-sum3/sum1))+(n4);
                            y5=(d5*(-sum3/sum1))+(n5);
                            y6=(d6*(-sum3/sum1))+(n6);
                            dy1.setText(String.valueOf(y1));
                            dy2.setText(String.valueOf(y2));
                            dy3.setText(String.valueOf(y3));
                            dy4.setText(String.valueOf(y4));
                            dy5.setText(String.valueOf(y5));
                            dy6.setText(String.valueOf(y6));

                            error.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    sum4= (float) Math.sqrt((sum2*sum2)+(sum3*sum3));
                                    closing.setText(String.valueOf(sum4));
                                }
                            });

                        }
                    });
                }if(s==7){
                    lengths.setVisibility(View.VISIBLE);
                    bearings.setVisibility(View.VISIBLE);
                    calc.setVisibility(View.VISIBLE);
                    error.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.VISIBLE);
                    l5.setVisibility(View.VISIBLE);
                    l6.setVisibility(View.VISIBLE);
                    l7.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    b3.setVisibility(View.VISIBLE);
                    b4.setVisibility(View.VISIBLE);
                    b5.setVisibility(View.VISIBLE);
                    b6.setVisibility(View.VISIBLE);
                    b7.setVisibility(View.VISIBLE);
                    calc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dx.setVisibility(View.VISIBLE);
                            dy.setVisibility(View.VISIBLE);
                            d1=Float.parseFloat(l1.getText().toString());
                            d2=Float.parseFloat(l2.getText().toString());
                            d3=Float.parseFloat(l3.getText().toString());
                            d4=Float.parseFloat(l4.getText().toString());
                            d5=Float.parseFloat(l5.getText().toString());
                            d6=Float.parseFloat(l6.getText().toString());
                            d7=Float.parseFloat(l7.getText().toString());
                            z1=Float.parseFloat(b1.getText().toString());
                            z2=Float.parseFloat(b2.getText().toString());
                            z3=Float.parseFloat(b3.getText().toString());
                            z4=Float.parseFloat(b4.getText().toString());
                            z5=Float.parseFloat(b5.getText().toString());
                            z6=Float.parseFloat(b6.getText().toString());
                            z7=Float.parseFloat(b7.getText().toString());
                            sum1=d1+d2+d3+d4+d5+d6+d7;
                            m1= (float) (d1*Math.sin(Math.toRadians(z1)));
                            m2= (float) (d2*Math.sin(Math.toRadians(z2)));
                            m3= (float) (d3*Math.sin(Math.toRadians(z3)));
                            m4= (float) (d4*Math.sin(Math.toRadians(z4)));
                            m5= (float) (d5*Math.sin(Math.toRadians(z5)));
                            m6= (float) (d6*Math.sin(Math.toRadians(z6)));
                            m7= (float) (d7*Math.sin(Math.toRadians(z7)));
                            sum2=m1+m2+m3+m4+m5+m6+m7;
                            n1= (float) (d1*Math.cos(Math.toRadians(z1)));
                            n2= (float) (d2*Math.cos(Math.toRadians(z2)));
                            n3= (float) (d3*Math.cos(Math.toRadians(z3)));
                            n4= (float) (d4*Math.cos(Math.toRadians(z4)));
                            n5= (float) (d5*Math.cos(Math.toRadians(z5)));
                            n6= (float) (d6*Math.cos(Math.toRadians(z6)));
                            n7= (float) (d7*Math.cos(Math.toRadians(z7)));
                            sum3=n1+n2+n3+n4+n5+n6+n7;
                            x1=(d1*(-sum2/sum1))+(m1);
                            x2=(d2*(-sum2/sum1))+(m2);
                            x3=(d3*(-sum2/sum1))+(m3);
                            x4=(d4*(-sum2/sum1))+(m4);
                            x5=(d5*(-sum2/sum1))+(m5);
                            x6=(d6*(-sum2/sum1))+(m6);
                            x7=(d7*(-sum2/sum1))+(m7);
                            dx1.setText(String.valueOf(x1));
                            dx2.setText(String.valueOf(x2));
                            dx3.setText(String.valueOf(x3));
                            dx4.setText(String.valueOf(x4));
                            dx5.setText(String.valueOf(x5));
                            dx6.setText(String.valueOf(x6));
                            dx7.setText(String.valueOf(x7));
                            y1=(d1*(-sum3/sum1))+(n1);
                            y2=(d2*(-sum3/sum1))+(n2);
                            y3=(d3*(-sum3/sum1))+(n3);
                            y4=(d4*(-sum3/sum1))+(n4);
                            y5=(d5*(-sum3/sum1))+(n5);
                            y6=(d6*(-sum3/sum1))+(n6);
                            y7=(d7*(-sum3/sum1))+(n7);
                            dy1.setText(String.valueOf(y1));
                            dy2.setText(String.valueOf(y2));
                            dy3.setText(String.valueOf(y3));
                            dy4.setText(String.valueOf(y4));
                            dy5.setText(String.valueOf(y5));
                            dy6.setText(String.valueOf(y6));
                            dy7.setText(String.valueOf(y7));

                            error.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    sum4= (float) Math.sqrt((sum2*sum2)+(sum3*sum3));
                                    closing.setText(String.valueOf(sum4));
                                }
                            });

                        }
                    });
                }if(s<1|s>7){
                    Toast.makeText(getContext(), "Enter number between 1 and 7!",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
