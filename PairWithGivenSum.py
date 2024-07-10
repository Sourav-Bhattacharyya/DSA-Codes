class PairWithGivenSum:
    n=int(input("Enter Number of elements"))
    sum=int(input("Enter sum"))
    a=True
    arr=[]
    def accept(self):
        for i in range(0,self.n):
            self.arr.append(int(input()))

    def find(self):
        for i in range (0,self.n):
            for j in range (i+1,self.n):
                if(self.arr[i]+self.arr[j] == self.sum):
                    print(self.arr[i],",",self.arr[j])
                    PairWithGivenSum.a=False
        if(self.a):
            print("Pair not found")

o1 = PairWithGivenSum()
o1.accept()
o1.find()