 static String catAndMouse(int x, int y, int z) {
        String result;
        int dis1= (z>x?z-x:x-z);
        int dis2= (z>y?z-y:y-z);
        if(dis1<dis2){
            result="Cat A";
        }
        else if(dis2<dis1){
            result="Cat B";
        }
        else{
            result="Mouse C";
        }
        return result;
    }
