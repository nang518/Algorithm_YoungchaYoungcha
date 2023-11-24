from math import ceil

def solution(fees, records):
    answer = []

    default_time, default_fee, unit_time, unit_fee = fees
    parking = {}
    parking_time = {}

    for record in records:
        time, number, io = record.split()
        hour, minute = map(int, time.split(':'))
        time = hour * 60 + minute

        if io == 'IN':
            parking[number] = time
        else:
            if number in parking_time:
                parking_time[number] += (time - parking[number])
            
            else:
                parking_time[number] = time - parking[number]
            
            del parking[number]
        
    for number, time in parking.items():
        if number in parking_time:
            parking_time[number] += 1439 - time
        else:
            parking_time[number] = 1439 - time
    
    for number, time in sorted(parking_time.items(), key = lambda x : x[0]):
        total_fee = default_fee + max(0, ceil((time-default_time) / unit_time)) * unit_fee
        answer.append(total_fee)

    return answer