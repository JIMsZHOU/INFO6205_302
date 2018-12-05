package edu.neu.coe.info6205.symbolTable;

import java.io.*;
import java.util.Random;

public class BSTmain {

    static Integer getRandom(int seed) {
        Random r = new Random();
        return r.nextInt(seed);
    }

    static boolean getRandom() {
        Random r = new Random();
        return r.nextBoolean();
    }

    public static void main(String[] args) throws IOException {
        /*
            Here I used my own BST implementation, since the original one have some problem when I add same key again and again.
            It will ultimately increase the size of BST, which should not be.
        */
        BSTmine<Integer, Integer> bst = new BSTmine<>();
        /*
            create a bst with 2000 nodes, the keys is from 0 - 1999.
            In other words, we create a full bst.
        */
        while (bst.size() < 2000) {
            bst.put(getRandom(2000), 1);
        }
        System.out.println("Origin height: " + bst.aveheight());
        System.out.println(bst.size());

        FileOutputStream fis = new FileOutputStream("./src/result.csv");
        OutputStreamWriter isr = new OutputStreamWriter(fis);
        BufferedWriter bw = new BufferedWriter(isr);
//        String content = "N,bst size,bst maxHeight, bst aveHeight,log(size),sqrt(size),log(N),sqrt(N)\n";
//        bw.write(content);
//        bw.flush();
        /*The step length is 10000, and start at 10000*/
        for (int N = 10000; N <= 500000; N += 10000) {
            for (int j = 0; j < N; j++) {
                /*we simply get a random key, first delete it, than insert it again.
                Since we generate keys from 0 to 1999. Therefore, the size of the binary tree will be constant.*/
                Integer k = getRandom(2000);
                bst.delete(k);
                bst.put(k, 1);
                /*Normally, if we delete the node, and add a node with same key again, the height of BST will not change so much.
                What we expect to see is the balance of BST will be broken via this modification.*/
            }
            System.out.println(N+","+bst.size()+","+bst.height()+","+bst.aveheight()+","+Math.log(bst.size())+","+Math.sqrt(bst.size()) + ","+Math.log(N)+","+Math.sqrt(N));
//            content = N+","+bst.size()+","+bst.height()+","+bst.aveheight()+","+Math.log(bst.size())+","+Math.sqrt(bst.size()) + ","+Math.log(N)+","+Math.sqrt(N)+"\n";
//            bw.write(content);
//            bw.flush();
        }
//        bw.close();
    }
}
