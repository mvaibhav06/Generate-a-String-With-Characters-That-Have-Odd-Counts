class GenerateTheString {
    public String generateTheString(int n) {
        char ch = 'a';
        char c = 'b';
        String out = "";
        if(n%2 == 0){
            int i = 0;
            while(i<n-1){
                out += ch;
                i++;
            }
            out += c;
        }else{
            int i = 0;
            while(i<n){
                out += ch;
                i++;
            }

        }
        return out;
    }
}
