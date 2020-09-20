try: 
   country_code = int(country_code) 
   print("+02") 
except: 
   print("Please check again before writing3!!!!") 
try: 
    case1 = input("Write your country code number: ") 
    case2 = int(case1) 
    print("Your country number has been added successfully!!!!", case2) 
except ValueError: 
    print("OOPs! please write your country code????") 