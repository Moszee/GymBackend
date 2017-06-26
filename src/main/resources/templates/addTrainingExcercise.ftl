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
        <h1>Training-Excercise andministration</h1>
    </div>
        <div class="col-md-2">
            <div class="panel-heading">
                <h3 class="panel-title">Client menu</h3>
            </div>
            <div class="panel-body">
                <ul class="nav nav-pills">
                    <li role="presentation" class="active">
                        <a href="/freemarker/trainingexcercise/add">
                            Add new trainingExcercise
                        </a>
                    </li>
                    <li role="presentation"><a href="#">List clients>/a></li>
                </ul>
            </div>
         </div>
         <div class="col-md-4">
            <h3> Add new trainingExcercise</h3>
            <form action="/freemarker/client/save" method="POST">
                <div class="form-group">
                    <label for="trainingId"> Training Id: </label>
                    <input type="number" name="trainingId" id="trainingId" class="form-control">
                </div>

                 <div class="form-group">
                    <label for="excerciseId">Excercise Id </label>
                    <input type="number" name="excerciseId" id="excerciseId" class="form-control">
                 </div>

                  <div class="form-group">
                     <label for="numberOfReapeats">Number of repeats</label>
                     <input type="number" name="numberOfReapeats" id="numberOfReapeats" class="form-control">
                  </div>

                 <button type="submit" class=btn btn-default>Save</button>
            </form>
          </div>
</div>
</body>

</html>