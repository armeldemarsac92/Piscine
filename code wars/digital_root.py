def digital_root(n):
    if len(str(n))>1:
        n = sum(list(int(x) for x in str(n)))

        return digital_root(n)

    else:
        return n



print(digital_root(1522154747778614478234))