class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] ans = new int[deck.length];
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < deck.length; i++) que.add(i);
        Arrays.sort(deck);
        for (int i = 0; i < deck.length; i++) {
            ans[que.poll()] = deck[i];
            if (!que.isEmpty()) que.add(que.poll());
        }
        return ans;
    }
}