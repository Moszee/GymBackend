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
        <h1>Clients administration</h1>
    </div>
    <div class="row">
        <div class=col-md-2">
            <div class="panel-heading">
            <h3 class="panel-title">Coach menu</h3>
            </div>
            <div class="panel-body">
                <ul class ="nav nav-pills">
                    <li role="presentatnion" class="activr">
                        <a href="/freemarker/coach/add">
                            Add new coach
                        </a>
                    </li>
                    <li role="presentation"><a href="#">List coach</a></li>
                </ul>
            </div>
        </div>
    </div>

    <div class="col-md-4">
        <h3>Add new coach</h3>
        <from action="freemarker/coach/save" method="POST">
        <div class="from-group">
            <label for="firstName"> First Name: </label>
            <input id="firstName" type="text" name="firstName" class="form-control">
        </div>

         <div class="from-group">
                    <label for="lastName"> Last Name: </label>
                    <input id="lastName" type="text" name="lastName" class="form-control">
         </div>

         <div class="from-group">
                    <label for="birthDate"> Birth Date: </label>
                    <input type="date" name="birthDate" id="birthDate" class="form-control">
         </div>

         <div class="from-group">
                    <label for="employmentDate"> Employment Date: </label>
                    <input type="date" name="employmentDate" id="employmentDate" class="form-control">
         </div>

         <div class="from-group">
                    <label for="position"> Position: </label>
                    <input id="position" type="text" name="position" class="form-control">
         </div>

         <button type="submit" class="btn btn-default">Sace</button>
         </form>
    </div>
</div>
</div>
</body>

</html>
//<body>
//<#list animals as item>
//    ${item} is an animal!
//</#list>
//</body>