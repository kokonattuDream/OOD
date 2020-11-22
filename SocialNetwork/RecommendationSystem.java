public class RecommendationSystem {
    public Set<User> recommendateFriends(int number, User user){
        Set<User> possibleFriends = new HashSet<>();
        Map<User, Integer> friendsRank = new HashMap<>();
        for(User friend: user.getFriends()){
            for(User friendOfFriend: friend.getFriends()){
                friendsRank.put(friendOfFriend, friendsRank.getOrDefault(friendOfFriend, 0) + 1);
            }
        }
        PriorityQueue<User> minHeap = new PriorityQueue((a,b) -> friendsRank.get(a) - friendsRank.get(b));

        for(User u: friendsRank.keySet()){
            if(minHeap.size() < number){
                minHeap.add(u);
            } else {
                if(minHeap.peek() < friendsRank.get(u)){
                    minHeap.poll();
                }
                minHeap.add(u);
            }
        }
        while(!minHeap.isEmpty()){
            possibleFriends.add(minHeap.poll());
        }
        return possibleFriends;
    }
}
