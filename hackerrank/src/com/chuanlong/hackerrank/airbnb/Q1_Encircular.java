package com.chuanlong.hackerrank.airbnb;

import java.util.ArrayList;
import java.util.List;

public class Q1_Encircular {

	/**
	 * https://www.hackerrank.com/tests/52d6d0953bddb/questions/k5eprpag
	 */
	public static void main(String[] args) {

		String[] res = doesCircleExist(new String[]{"L"});
		
	}
	
	
    static String[] doesCircleExist(String[] commands) {
    	
    	if(commands != null){
    		String[] res = new String[commands.length];
    		
    		for(int m=0; m<commands.length; m++){
    			char[] cmds = commands[m].toCharArray();
    			
    	    	Pos current = new Pos(Pos.RIGHT, 0, 0);
    	    	
    	    	List<Pos> list = new ArrayList<Pos>();
    	    	list.add(current);

    	    	for(int i=0; i<4; i++){
    	    		for(int j=0; j<cmds.length; j++){
    	    			current = go(current, cmds[j]);
    	    		}
    	    		
    	    		if(isExist(list, current)){
    	    			res[m] = "YES";
    	    			break;
    	    		}else{
    	    			list.add(current);
    	    		}
    	    	}
    	    	
    	    	if(res[m] == null){
        	    	res[m] = "NO";    	    		
    	    	}
    		}
    		return res;
    	}
    	return null;
    }
    
    static boolean isExist(List<Pos> list, Pos p){
    	for(int i=0; i<list.size(); i++){
    		if(list.get(i).isEqual(p)){
    			return true;
    		}
    	}
    	return false;
    }
	
	static Pos go(Pos start, char command) {
		if (command == 'G') {
			if (start.d == Pos.RIGHT) {
				return new Pos(start.d, start.x + 1, start.y);
			} else if (start.d == Pos.DOWN) {
				return new Pos(start.d, start.x, start.y - 1);
			} else if (start.d == Pos.LEFT) {
				return new Pos(start.d, start.x - 1, start.y);
			} else if (start.d == Pos.UP) {
				return new Pos(start.d, start.x, start.y + 1);
			}
		} else if (command == 'L') {
			return new Pos((start.d + 4 - 1) % 4, start.x, start.y);
		} else if (command == 'R') {
			return new Pos((start.d + 1) % 4, start.x, start.y);
		}
		return start;
	}
    
    static class Pos{
    	public static final int RIGHT=0, DOWN=1, LEFT=2, UP=3;
    	
    	public int d;
    	public int x, y;
    	
    	public Pos(int d, int x, int y){
    		this.d = d;
    		this.x = x;
    		this.y = y;
    	}
    	
    	public boolean isEqual(Pos s){
    		if(s != null && d == s.d
    				&& x == s.x && y == s.y){
    			return true;
    		}else{
    			return false;
    		}
    	}
    }
    

}
