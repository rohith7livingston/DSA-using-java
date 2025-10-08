def add_edge(adj, i, j):
    adj[i].append(j)   # add edge from i to j


def display_graph(adj):
    for i in range(len(adj)):
        lis = []
        for j in adj[i]:       
            lis.append(j)
        print(f"{i} -> {lis}")

def bfs(adj,v):
    res = []
    start = 0
    visites = [False]*v
    visites[start] = True
    from collections import deque
    que = deque()
    que.append(start)

    while que:
        node = que.popleft()
        res.append(node)
        for i in adj[node]:
            if not visites[i]:
                visites[i] = True
                que.append(i)
    print(res)
    

if __name__ == "__main__":
    v = 5
    adj = [[] for _ in range(v)]  # create adjacency list for 5 vertices

    add_edge(adj, 0, 1)
    add_edge(adj, 0, 2)
    add_edge(adj, 1, 0)
    add_edge(adj, 1, 2)
    add_edge(adj, 1, 3)
    add_edge(adj, 2, 0)
    add_edge(adj, 2, 1)
    add_edge(adj, 3, 1)
    add_edge(adj, 3, 4)
    add_edge(adj, 4, 2)
    add_edge(adj, 4, 3)

    print("Graph adjacency list:")
    display_graph(adj)

    print("BFS traversal starting from vertex 0:")
    bfs(adj,v)
