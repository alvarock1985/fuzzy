package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainXu08 xu = new MainXu08();
		String[] resources = {"x1","x2","x3","x4","x5"};
		String[] attributes = {"benefit", "benefit", "cost"};
		double[] weightYears = {1.0/6, 2.0/6, 3.0/6 };
		int nResources = resources.length;
		int nAtt = attributes.length;
		int horizonTime = weightYears.length;
		double[][] weigths = {{0.4,0.4,0.2},{0.4,0.35,0.25},{0.4,0.3,0.3}}; 
		double[][] x1 = {{0.75,0.85,0.50 },{0.80,0.90,0.45},{0.90,0.85,0.30}};
		double[][] x2 = {{0.95,0.70,0.45},{0.90,0.85,0.40},{0.85,0.90,0.35}};
		double[][] x3 = {{0.80,0.90,0.35},{0.85,0.80,0.40},{0.95,0.85,0.45}};
		double[][] x4 = {{0.90,0.80,0.40},{0.85,0.75,0.50},{0.90,0.80,0.45}};
		double[][] x5 = {{0.85,0.85,0.55},{0.90,0.90,0.60},{0.95,0.85,0.50}};
		
		ArrayList<double[][]> allData = new ArrayList<>();
		allData.add(x1);
		allData.add(x2);
		allData.add(x3);
		allData.add(x4);
		allData.add(x5);
		ArrayList<Double> norm = new ArrayList<>();
		double[][][] decision = new double[3][3][5];
		for(int i=0;i<horizonTime;i++){
			double[][] aux = null;
			for(int a=0;a<nAtt;a++){
				 for(int b =0;b<nResources;b++){
					 aux = allData.get(b);
					
					 decision[i][a][b] = aux[i][a]; 
				 }
			}
		}
		
		double[][][] normal = new double[3][3][5];
		for(int t=0;t<horizonTime;t++){
			double[][] aux = new double[1][1];
			for(int a=0;a<nAtt;a++){
				for(int x=0;x<nResources;x++){
					normal[t][a][x] = decision[t][a][x];
					
				}
			}
		}
		
		
		
		System.out.println(decision[0][0].length);
		for(int i=0;i<decision[0][0].length;i++){
			
			norm.add(decision[0][0][i]);
		}
		
		System.out.println(Collections.max(norm));
		
		
		
	}

}
