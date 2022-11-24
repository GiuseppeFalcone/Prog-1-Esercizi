int a;
int b;
if (a > b){
  diff = meno(a, b);
}

meno(a, b){
  int i = 0;
  while (i <= b){
    i = i + 1;
    a = a - 1;
  }
  return a;
}

int quoz;
int resto;

quoz , resto = quoziente (a, b)

quoziente (D, d) {
  int q = 0;
  while (D >= 0){
    q = q + 1;
    D = meno (D, d);
  }
  return q;
}
