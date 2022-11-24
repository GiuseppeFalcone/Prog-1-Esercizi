int n;
int fatt = fattoriale(n);

fattoriale (x) {
  int i = 0;
  int f = 1;
  while (i < x) {
    f = f * (x - i);
    i = i + 1;
  }
  return f;
}
