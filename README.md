# Create and connect to repo
echo "# SDF-02" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/lkas96/SDF-02.git
git push -u origin main

#