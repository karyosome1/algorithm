import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고 기록 중복 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        // 유저별로 신고당한 사람 기록
        Map<String, Set<String>> reportedBy = new HashMap<>();
        // 유저별로 자신이 누구를 신고했는지
        Map<String, Set<String>> reports = new HashMap<>();
        
        for (String r : reportSet) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String target = parts[1];
            
            // 신고한 사람 기록
            reports.computeIfAbsent(reporter, v -> new HashSet<>()).add(target);
            // 신고당한 사람에게 누가 신고했는지 기록
            reportedBy.computeIfAbsent(target, v -> new HashSet<>()).add(reporter);
        }
        
        // k번 이상 신고당한 유저 리스트
        Set<String> banned = new HashSet<>();
        for (Map.Entry<String, Set<String>> entry : reportedBy.entrySet()) {
            if (entry.getValue().size() >= k) {
                banned.add(entry.getKey());
            }
        }
        
        // 결과 메일 수 계산
        Map<String, Integer> mailCount = new HashMap<>();
        for (String user : id_list) {
            mailCount.put(user, 0); // 초기화
        }
        
        for (String user : id_list) {
            Set<String> targets = reports.getOrDefault(user, new HashSet<>());
            int count = 0;
            for (String t : targets) {
                if (banned.contains(t)) {
                    count++;
                }
            }
            mailCount.put(user, count);
        }
        
        // id_list 순서대로 결과 추출
        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            result[i] = mailCount.get(id_list[i]);
        }
        return result;
    }
}