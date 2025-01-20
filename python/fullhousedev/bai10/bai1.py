class PhanSo:
    def __init__(self,
                    tu: int,
                    mau: int):
        self.tu= tu
        self.mau= mau

    def toi_gian(self) -> None:
        uoc = ucln(self.tu, self.mau)
        self.tu //= uoc 
        self.mau //= uoc
        if self.mau < 0:
            self.tu = -self.tu
            self.mau = -self.mau
        
def ucln(a, b) -> int:
    while b != 0:
        tmp = a % b
        a = b
        b = tmp
    return a

if __name__ == "__main__":
    a, b = map(int, input().split())
    phan_so = PhanSo(a, b)
    phan_so.toi_gian()
    print(f"{phan_so.tu}/{phan_so.mau}")

