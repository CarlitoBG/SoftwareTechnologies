using BookLibrary.Models;
using Microsoft.AspNet.Identity;
using System.Data.Entity;
using System.Linq;
using System.Web.Mvc;

namespace BookLibrary.Controllers
{
    public class BookController : Controller
    {
        // GET: Book
        public ActionResult Index()
        {
            using (var db = new ApplicationDbContext())
            {
                var books = db.Books.Include(b => b.Author).ToList();

                return View(books);
            }
        }

        // GET: Book/Details/5
        public ActionResult Details(int id)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books.Include(b => b.Author).SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return new HttpNotFoundResult($"Can not find book with ID {id}");
                }

                return View(book);
            }
        }

        // GET: Book/Create
        [Authorize]
        public ActionResult Create()
        {
            return View();
        }

        // POST: Book/Create
        [HttpPost]
        [Authorize]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Book book)
        {
            using (var db = new ApplicationDbContext())
            {
                var userId = User.Identity.GetUserId();

                book.AuthorId = userId;

                db.Books.Add(book);
                db.SaveChanges();

                return RedirectToAction("Index");
            }
        }

        // GET: Book/Edit/5
        [Authorize]
        public ActionResult Edit(int id)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books.SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return new HttpNotFoundResult($"Can not find book with ID {id}");
                }

                if (book.AuthorId != User.Identity.GetUserId())
                {
                    return new HttpUnauthorizedResult("You can't touch this!");
                }

                return View(book);
            }
        }

        // POST: Book/Edit/5
        [HttpPost]
        [Authorize]
        public ActionResult Edit(int id, Book bookViewModel)
        {
            if (bookViewModel.Title == null || bookViewModel.Description == null)
            {
                return View(bookViewModel);
            }

            using (var db = new ApplicationDbContext())
            {
                var book = db.Books.Include(b => b.Author).SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return new HttpNotFoundResult($"Can not find book with ID {id}");
                }

                if (book.AuthorId != User.Identity.GetUserId())
                {
                    return new HttpUnauthorizedResult("You can't touch this!");
                }

                book.Title = bookViewModel.Title;
                book.Description = bookViewModel.Description;

                db.SaveChanges();
            }

            return RedirectToAction("Details", new { id = id });
        }

        // GET: Book/Delete/5
        [Authorize]
        public ActionResult Delete(int id)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books.SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return new HttpNotFoundResult($"Can not find book with ID {id}");
                }

                if (book.AuthorId != User.Identity.GetUserId())
                {
                    return new HttpUnauthorizedResult("You can't touch this!");
                }

                return View(book);
            }
        }

        // POST: Book/Delete/5
        [HttpPost]
        [Authorize]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, Book bookViewModel)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books.SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return HttpNotFound($"Book with ID {id} not found!");
                }

                if (book.AuthorId != User.Identity.GetUserId())
                {
                    return new HttpUnauthorizedResult("You can't touch this!");
                }

                db.Books.Remove(book);
                db.SaveChanges();

                return RedirectToAction("Index");
            }
        }
    }
}