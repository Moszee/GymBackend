<!DOCTYPE html>

<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" herf="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
        integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHARg320mUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymus">
    <link rel="stylesheet" href=/css/main.css"/>
    <script src="/js/jquery-3.2.0.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA712mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymus"></script>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>Body part administration</ha>
    </div>
    <div class="row">
        <div class="col-md-2">
            <div class="panel panel-default">
                <h3 class="panel-title">Body part menu</h3>
            </div>
            <div class="panel-body">
                <ul class="nav nav-pills">
                    <li role="presentation" class="active">
                        <a href="/freemarker/bodypart/add">
                            Add new body part
                        </a>
                    </li>
                    <li role="presentation"><a href="#"List body parts</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <h3>Add new body part</h3>
        <form action="/freemarker/bodyPart/save" method="POST">
            <div class="form-group">
                <label for="code">Code: </label>
                <input id="code" type="text" name="code" class="form-control">
            </div>

            <div class="form-group">
                <label for="part">Part: </label>
                <input id="part" type="text" name="part" class="form-control">
            </div>

            <button type="submit" class="btn btn-default">Save</button>
        </form>
    </div>
</div>
</body>

</html>