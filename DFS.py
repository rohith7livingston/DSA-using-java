def add_edge(mat,i,j):
    mat[i][j] = 1   # add edge from i to j
    mat[j][i] = 1   # add edge from j to i (for undirected graph)

def display_graph(mat):
    for row in mat:
        print(row)
            
def dfs(visited,s,mat,res):
    visited[s] = True
    res.append(s)
    for i in range(len(mat)):
        if mat[s][i] == 1 and visited[i] == False:
            res = dfs(visited,i,mat,res)
    return res


if __name__ == "__main__":
    v= 5
    mat = [[0] * v for _ in range(v)]
    add_edge(mat,0,1)
    add_edge(mat,0,2)
    add_edge(mat,1,0)
    add_edge(mat,1,2)
    add_edge(mat,1,3)
    add_edge(mat,2,0)
    add_edge(mat,2,1)
    add_edge(mat,2,4)
    add_edge(mat,3,1)
    add_edge(mat,3,4)
    add_edge(mat,4,2)
    add_edge(mat,4,3)
    display_graph(mat)
    visited = [False] * v 
    print()
    res = dfs(visited,0,mat,[])
    print(res)