import sys
from collections import deque

input = sys.stdin.readline

result = []


def BFS(a, b):
  q = deque()
  q.append((a, b))
  g[a][b] = 0
  cnt = 1
  while q:
    x, y = q.popleft()

    for i in range(4):
      ix = x + dx[i]
      iy = y + dy[i]
      if (0 <= ix < n) and (0 <= iy < n):
        if g[ix][iy] == "1":
          g[ix][iy] = 0
          q.append((ix, iy))
          cnt += 1
  result.append(cnt)


n = int(input())

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
cnt = 0
g = [list(input().strip()) for _ in range(n)]
for i in range(0, n):
  for j in range(0, n):
    if g[i][j] == "1":
      BFS(i, j)
      cnt += 1

print(cnt)
result.sort()
for i in result:
  print(i)