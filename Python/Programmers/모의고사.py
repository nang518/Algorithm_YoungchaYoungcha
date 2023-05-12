def solution(answers):
    answer = []
    #학생 답
    student1 = [1,2,3,4,5]
    student2 = [2,1,2,3,2,4,2,5]
    student3 = [3,3,1,1,2,2,4,4,5,5]

    #각 학생의 정답 개수
    count = [0,0,0,0]
    
    for i in range(len(answers)):
        if answers[i] == student1[i%5]:
            count[1] += 1
        if answers[i] == student2[i%8]:
            count[2] += 1
        if answers[i] == student3[i%10]:
            count[3] += 1
        
    for i in range(1,4):
        if count[i] == max(count):
            answer.append(i)

    return answer