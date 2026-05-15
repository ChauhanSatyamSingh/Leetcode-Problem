class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char _s = s.charAt(i),
                 _t = t.charAt(i);

            if(!sToT.containsKey(_s) && !tToS.containsKey(_t)) {
                sToT.put(_s, _t);
                tToS.put(_t, _s);
            } else if(sToT.get(_s) == null) return false;
            else if(tToS.get(_t) == null) return false;
            else if(sToT.get(_s) != _t && tToS.get(_t) != _s) return false;
        }

        return true;
    }
}