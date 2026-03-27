import java.util.*;
public class HmCode {
    static class HashMap<K,V>{ // generics
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>buckets[];

        public HashMap(){
            this.N =4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc=key.hashCode();
            hc=Math.abs(hc)%N;  //to avoid array out of bound
            return hc;
        }
        private int SearchInLL(K key,int bi){
            LinkedList<Node>ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node>oldBuck[]=buckets;
            buckets=new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            // old data is putting to new array
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node>ll=oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }



        }

        public void put(K key,V value){
            int bi=hashFunction(key);
            int dataIndex=SearchInLL(key,bi);
            if(dataIndex!=-1){
                Node node=buckets[bi].get(dataIndex);
                node.value=value;
            }
            else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda=(double)(n/N);
            if(lambda>2.0){  // 2.0 just a random threshold we have taken
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int dataIndex=SearchInLL(key,bi);
            if(dataIndex!=-1){
                return true;
            }
            return false;
        }

        public V get(K key){
            int bi=hashFunction(key);
            int dataIndex=SearchInLL(key,bi);
            if(dataIndex!=-1){
               Node node=buckets[bi].get(dataIndex);
               return node.value;
            }
            return null;
        }
        public V remove(K key){
            int bi=hashFunction(key);
            int dataIndex=SearchInLL(key,bi);
            if(dataIndex!=-1){
                Node node=buckets[bi].remove(dataIndex);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K>keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node>ll=buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;

        }

        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String args[]){
        HashMap<String,Integer>hm=new HashMap<>();

    }




}
