<!DOCTYPE html>

<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
            integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/main.css"/>
    <script src="/js/jquery-3.2.0.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>Excercise administration</h1>
    </div>
    <div class="row">
        <div class="col-md-2">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Excercise menu</h3>
                </div>
                <div class="panel-body">
                      <ul class="nav nav-pills">
                        <li role="presentation" class="active">
                               <a href="/freemarker/client/add">
                                   Add new excercise
                               </a>
                        </li>
                        <li role="presentation"><a href="#">List clients</a></li>
                      </ul>
                </div>
            </div
        </div>
        <div class="col-md-4">
            <h3>Add new excercise</h3>
            <form action="/freemarker/excercise/save" method="POST">

                <div class="form-group">
                    <label for="excerciseName">Excercise Name: </label>
                    <input type="text" name="excerciseName" id="excerciseName" class="form-control">
                </div>


                <div class="form-group">
                    <label for="bodyPartCode">Body Part Code: </label>
                    <input type="text" name="bodyPartCode" id="bodyPartCode" class="form-control">
                </div>

                <button type="submit" calss="btn btn-default">Save</button>
            </form>
        </div>
     </div>
</div>
</body>

</html>

