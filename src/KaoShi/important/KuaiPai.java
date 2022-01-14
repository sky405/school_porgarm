package KaoShi.important;

import java.lang.reflect.Type;

/**
 * 快速排序
 */
public class KuaiPai {

   public void sort(Type a[], int p, int r){

       if(r < p) return;

       int q = partition(a, p, r);

       sort(a, p, q-1);
       sort(a, q+1, r);
   }

    private int partition(Object[] a, int p, int r) {
       return 0;
    }

    public void sort(Integer[] g, int f, int l){

       if(f > l) return ;
       int p = partition(g, f, l);

       sort(g, f, p-1);
       sort(g, p+1, l);
    }
}

